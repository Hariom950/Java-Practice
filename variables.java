import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Value of A is=");
        int a=sc.nextInt();
        System.out.print("Value of B is=");
        int b=sc.nextInt();

        int Sum = a+b;
        System.out.print("sum of A and B is=");
        System.out.print(Sum);

    }
}