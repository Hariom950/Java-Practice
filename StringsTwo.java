import java.util.*;

public class StringsTwo {
    public static void main(String[] args) {
        //concatenation  --- strings functions 
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // length();
        System.out.println(fullName.length());

        //charAt --> print all charactors
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(firstName.charAt(i));
        }
    }
}
