package org.stringbuilderbuffersearching.linearsearch.searchspecificword;
import static java.lang.System.*;
import java.util.Scanner;

public class SearchSpecificWord {

    public static String searchSpecificWord(String [] str,String wordToSearch){

        for(String s : str){
            String words[] = s.split(" ");
            for(String word : words){
                if(word.equals(wordToSearch)){
                    return s;
                }
            }

        }
        return "NOT FOUND";
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        // String array of sentences
        String [] sentences = new String[5];
        out.println("Enter the Sentences  : ");
         for(int i=0; i<sentences.length; i++){
             sentences[i] = sc.nextLine();
         }
         out.println("Enter the word to search : ");
         String wordtosearch = sc.next();

         out.println("The Sentence that contains the word "+wordtosearch+" is : ");
         out.println(searchSpecificWord(sentences,wordtosearch));
    }
}
