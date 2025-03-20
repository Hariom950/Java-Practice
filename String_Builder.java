import java.util.*;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hariom");     //sb string bnayi h, jiska type hai StringBuilder
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //insert mean add
        sb.insert(0, 's');  //index num then value, 
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);

        //append (last me jodna)
        sb.append("e");
        sb.append("l");
        System.out.println(sb);
        System.out.println(sb.length());


    }
    
}
