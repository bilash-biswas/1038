#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    int X,Y;
    double A;
    cin>>X;
    cin>>Y;
    switch(X){
case 1:
    A = 4.00 * Y;
    break;
case 2:
    A = 4.50 * Y;
    break;
case 3:
    A = 5.00 * Y;
    break;
case 4:
    A = 2.00 * Y;
    break;
case 5:
    A = 1.50 * Y;
    break;
    }
cout<<"Total: R$ "<<fixed<<setprecision(2)<<A<<endl;
    return 0;
}
