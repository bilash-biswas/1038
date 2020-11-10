#include<stdio.h>
int main()
{
    int X,Y;
    double A,B,C,D,E;
    scanf("%d%d",&X,&Y);
    switch(X)
    {
    case 1:
        A = 4.00 * Y;
        printf("Total: R$ %.2lf\n", A);
        break;
    case 2:
        B = 4.50 * Y;
        printf("Total: R$ %.2lf\n", B);
        break;
    case 3:
        C = 5.00 * Y;
        printf("Total: R$ %.2lf\n", C);
        break;
    case 4:
        D = 2.00 * Y;
        printf("Total: R$ %.2lf\n", D);
        break;
    case 5:
        E = 1.50 * Y;
        printf("Total: R$ %.2lf\n", E);
        break;
    }
    return 0;
}
