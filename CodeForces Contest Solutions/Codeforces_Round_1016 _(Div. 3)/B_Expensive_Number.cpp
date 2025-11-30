#include <iostream>
using namespace std;
#define ll long long
int main()
{
    ll t;
    cin >> t;
    while (t--)
    {
        string n;
        cin >> n;
        ll ans = 0, digit = 0, zero = 0;
        bool haveZero=false, nonZero=false;
        for (int i = n.size() - 1; i >= 0; i--)
        {
            int ld = n[i] - '0';

            if (ld == 0)
                haveZero = true;

            if (ld == 0 && !nonZero)
            {
                zero++;
            }
            else if (ld != 0)
            {
                ans++;
                nonZero = true;
            }

            digit++;
        }

        if (haveZero)
        {
            cout << (ans + zero - 1) << "\n";
        }
        else
        {
            cout << (digit - 1) << "\n";
        }
    }
    return 0;
}