#include <iostream>
using namespace std;
int main()
{
    int m, n;

    cin >> m >> n;

    if (m % 2 == 0 && n % 2 == 0)
        cout << ((m / 2) * n);

    else if (m % 2 != 0 && n % 2 != 0)
        cout << ((n * m) - 1) / 2;

    else
    {
        if(m % 2 == 0)
            cout << ((m / 2) * n);

        else
            cout << ((n / 2) * m);
    }

    return 0;
}
