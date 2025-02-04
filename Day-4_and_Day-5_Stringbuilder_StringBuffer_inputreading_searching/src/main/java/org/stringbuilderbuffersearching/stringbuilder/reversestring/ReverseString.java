package org.stringbuilderbuffersearching.stringbuilder.reversestring;
import static java.lang.System.out;

class ReverseString {

    public  String reverseString(String str){
        int n = str.length();
         //Creating a string builder
        StringBuilder sb = new StringBuilder(str);

        // using reverse method
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[]args){
        ReverseString s = new ReverseString();

        //input string
        String originalString = "hello";

        //calling the reverseString method
        String reverseString = s.reverseString(originalString);

        //Display
        out.println("Original String : "+originalString);
        out.println("Reversed String : "+reverseString);
    }

}
