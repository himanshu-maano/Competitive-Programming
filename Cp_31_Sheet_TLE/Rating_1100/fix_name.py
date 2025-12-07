import os
import re

# CONFIGURATION
# Set to True to apply changes. False for Dry Run.
EXECUTE_CHANGES = True 

def get_problem_details(content):
    """
    Extracts (contest_id, index) tuple from content.
    Returns: ('1791', 'G1') or None
    """
    # Regex for codeforces.com/contest/1234/problem/A
    # or codeforces.com/problemset/problem/1234/A
    url_pattern = r"codeforces\.com/(?:contest|problemset/problem)/(\d+)/(\w+)"
    match = re.search(url_pattern, content)
    if match:
        return match.group(1), match.group(2)
    return None

def clean_filename(old_name, index):
    """
    Removes the problem index (e.g., 'A_', 'G1_', 'G_1_') from the start of the filename.
    """
    # 1. Try removing exact index match (e.g., 'G1_')
    # Case insensitive, optional underscore
    pattern_exact = rf"^{re.escape(index)}_?"
    cleaned = re.sub(pattern_exact, "", old_name, flags=re.IGNORECASE)
    
    # 2. Try removing split index match (e.g., 'G_1_' when index is 'G1')
    # Only applies if index has a letter and number (like G1)
    if len(index) > 1 and index[0].isalpha() and index[1].isdigit():
        pattern_split = rf"^{index[0]}_{index[1:]}_"
        cleaned = re.sub(pattern_split, "", cleaned, flags=re.IGNORECASE)

    # 3. Final cleanup of any leading underscores left behind
    cleaned = cleaned.lstrip('_')
    return cleaned

def process_folder():
    print(f"--- STARTING ({'DRY RUN' if not EXECUTE_CHANGES else 'LIVE MODE'}) ---")
    
    files = [f for f in os.listdir('.') if os.path.isfile(f)]
    
    for filename in files:
        if filename == "fix_names.py" or not (filename.endswith('.java') or filename.endswith('.cpp')):
            continue

        # Skip if already correct (starts with CF + digits)
        if re.match(r"^CF\d+", filename):
            continue

        try:
            with open(filename, 'r', encoding='utf-8') as f:
                content = f.read()
            
            details = get_problem_details(content)
            
            if not details:
                print(f"❌ No URL found in {filename}. Skipping.")
                continue

            contest_id, index = details
            prefix = f"CF{contest_id}{index}"
            
            # --- THE FIX IS HERE ---
            old_name_no_ext = os.path.splitext(filename)[0]
            extension = os.path.splitext(filename)[1]
            
            # Clean the garbage off the old name
            clean_name_base = clean_filename(old_name_no_ext, index)
            
            # Construct new name
            new_name_no_ext = f"{prefix}_{clean_name_base}"
            new_filename = f"{new_name_no_ext}{extension}"

            print(f"✅ Renaming: {filename} \n   -> {new_filename}")

            if EXECUTE_CHANGES:
                # 1. Update Java Class Name
                if filename.endswith('.java'):
                    # We must replace the OLD class name with the NEW class name
                    class_pattern = r"(public\s+class\s+)" + re.escape(old_name_no_ext) + r"(\b)"
                    if re.search(class_pattern, content):
                        new_content = re.sub(class_pattern, r"\1" + new_name_no_ext + r"\2", content)
                        with open(filename, 'w', encoding='utf-8') as f:
                            f.write(new_content)
                        print(f"   └── Refactored Java class name")
                    else:
                        print(f"   ⚠️ WARNING: Could not find 'class {old_name_no_ext}' inside file.")

                # 2. Rename file
                os.rename(filename, new_filename)

        except Exception as e:
            print(f"   🔥 Error processing {filename}: {e}")

    print("\n--- DONE ---")

if __name__ == "__main__":
    process_folder()