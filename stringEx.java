public class stringEx {
    public static void main(String[] args) {
        //compare
        String name1 = "Tony";
        String namw2 = "Tony";

        if (name1.compareTo(namw2) == 0) {
            System.out.println("string are equel");    
        } else {
            System.out.println("strings are not equel");
        }

        // subString(0, 4)
        String sentance = "Hario singh";
        String name = sentance.substring(0, 4);
        System.out.println(name);

        //String are immutable
    }
}