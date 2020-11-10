import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int X,Y;
    double A,B,C,D,E;
    X = input.nextInt();
    Y = input.nextInt();
    switch(X)
    {
    case 1:
        A = 4.00 * Y;
        System.out.printf("Total: R$ %.2f\n", A);
        break;
    case 2:
        B = 4.50 * Y;
        System.out.printf("Total: R$ %.2f\n", B);
        break;
    case 3:
        C = 5.00 * Y;
        System.out.printf("Total: R$ %.2f\n", C);
        break;
    case 4:
        D = 2.00 * Y;
        System.out.printf("Total: R$ %.2f\n", D);
        break;
    case 5:
        E = 1.50 * Y;
        System.out.printf("Total: R$ %.2f\n", E);
        break;
    }
  }  
}
