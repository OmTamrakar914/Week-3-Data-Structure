package org.stringbuilderbuffersearching.stringbuilder.removeduplicate;
import static java.lang.System.*;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicates {
    public static String removeDuplicate(String str){
        int n = str.length();

        StringBuilder sb = new StringBuilder();

        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[]args){

        //String with duplicates
        String duplicate = "Raaammmmm";

        //String without duplicates
        String withoutDuplicate = removeDuplicate(duplicate);

        //Display
        out.println("String with Duplicates    : "+duplicate);
        out.println("String without Duplicates : "+withoutDuplicate);

    }
}
