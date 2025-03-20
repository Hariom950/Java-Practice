// find X num of array

import java.util.*;

public class numFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i]=sc.nextInt();
        }

        int x=sc.nextInt();  // X ko input le liya

        //output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x found at index :" + i);
            }
           
        }
    }
}