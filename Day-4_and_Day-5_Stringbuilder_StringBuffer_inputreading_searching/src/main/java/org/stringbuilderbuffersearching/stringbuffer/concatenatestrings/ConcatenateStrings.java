package org.stringbuilderbuffersearching.stringbuffer.concatenatestrings;
import static java.lang.System.*;
public class ConcatenateStrings {

    public static String concatenate(String[]arr){

        StringBuffer sb = new StringBuffer();

        for(String st : arr){
            sb.append(st);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[]args){

        //array of strings
        String [] string = {"Wish","You","a","very","Happy","Birthday","!!!"};

        //Concatenated strings
        String concateString = concatenate(string);

        //Display
        out.print("The Array of Strings   : ");
        for(String st : string){
            out.print("\""+st+"\", ");
        }
        out.println();
        out.println("The concated string is : "+concateString);
    }


}
