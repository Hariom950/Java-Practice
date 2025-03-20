import java.util.Scanner;
public class button {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();

        if(button == 1) {
            System.out.println("first button");
        } 
        else if(button==2) {
            System.out.println("second button");
        }
        else if (button==3) {
            System.out.println("third button");
        }
        else {
            System.out.println("invailed input");
        }
    }
}
