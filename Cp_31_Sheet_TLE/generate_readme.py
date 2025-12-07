import os
import re
import urllib.parse

# --- CONFIGURATION ---
# The exact name of the folder inside your repo
REPO_FOLDER_NAME = "Cp_31_Sheet_TLE"
TARGET_FOLDERS = ["Rating_800", "Rating_900", "Rating_1000", "Rating_1100"]

def get_file_info(filepath):
    try:
        with open(filepath, 'r', encoding='utf-8') as f:
            content = f.read()
        url_match = re.search(r"(https?://codeforces\.com/(?:contest|problemset/problem)/\d+/\w+)", content)
        if url_match:
            return url_match.group(1)
    except Exception:
        return None
    return None

def clean_problem_name(filename):
    name_no_ext = os.path.splitext(filename)[0]
    match = re.match(r"^(CF\d+[A-Za-z0-9]*)_(.+)$", name_no_ext)
    if match:
        clean = match.group(2)
    else:
        match_simple = re.match(r"^[A-Z0-9]+_(.+)$", name_no_ext)
        if match_simple:
            clean = match_simple.group(1)
        else:
            clean = name_no_ext
    return clean.replace("_", " ")

def generate_markdown():
    # Anchor to the script location
    script_dir = os.path.dirname(os.path.abspath(__file__))
    
    readme_content = "# TLE Eliminators CP-31 Sheet Solutions\n\n"
    readme_content += "**Tracker:** [TLE CP-31 Sheet](https://www.tle-eliminators.com/cp-sheet)\n\n"
    
    for folder_name in TARGET_FOLDERS:
        full_folder_path = os.path.join(script_dir, folder_name)
        
        if not os.path.exists(full_folder_path):
            print(f"⚠️  Skipping {folder_name} (Not found)")
            continue
            
        print(f"✅ Processing {folder_name}...")
        
        readme_content += f"<details>\n<summary><strong>📂 {folder_name}</strong></summary>\n<br>\n\n"
        readme_content += "| Problem Name | Solution | Status |\n"
        readme_content += "| :--- | :---: | :---: |\n"
        
        files = sorted(os.listdir(full_folder_path))
        
        for filename in files:
            if not (filename.endswith('.java') or filename.endswith('.cpp')):
                continue
            
            filepath = os.path.join(full_folder_path, filename)
            url = get_file_info(filepath)
            display_name = clean_problem_name(filename)
            
            # --- THE FIX: ROOT ANCHOR ---
            # We construct the path starting with a SLASH (/)
            # This forces GitHub to look from the root of the repository.
            # Result: /Cp_31_Sheet_TLE/Rating_1100/File.java
            
            repo_path = f"/{REPO_FOLDER_NAME}/{folder_name}/{filename}"
            
            # Encode spaces to %20
            link_safe = urllib.parse.quote(repo_path)
            
            # No dot at the start. Just the slash.
            markdown_link = link_safe

            if url:
                col_problem = f"[{display_name}]({url})"
            else:
                col_problem = display_name
                
            col_solution = f"[View Code]({markdown_link})"
            
            readme_content += f"| {col_problem} | {col_solution} | ✅ |\n"

        readme_content += "\n</details>\n\n"

    output_path = os.path.join(script_dir, "README.md")
    with open(output_path, "w", encoding="utf-8") as f:
        f.write(readme_content)
    
    print(f"🎉 generated README at {output_path}")

if __name__ == "__main__":
    generate_markdown()