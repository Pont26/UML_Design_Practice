package Assignment3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteDuplicateWord {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice="";
        do { int count = 0;
        String[] words = new String[20];
        String currentWord = "";
        
           System.out.print("Enter a sentence: ");
           String input = br.readLine();
           for (int i = 0; i < input.length(); i++) {
               char ch = input.charAt(i);
               if (ch != ' ') {
                   currentWord += ch;
               } else if (!currentWord.equals("")) {
                   words[count] = currentWord;
                   count++;
                   currentWord = "";
               }
           }

           if (!currentWord.equals("")) {
               words[count] = currentWord;
               count++;
           }

           String[] uniqueWords = new String[count];
           int uniqueCount = 0;


           for (int j = 0; j < count; j++) {
               int i;

               for (i = 0; i < uniqueCount; i++) {
                   if (words[j].equals(uniqueWords[i])) {
                       break;
                   }
               }


               if (i == uniqueCount) {
                   uniqueWords[uniqueCount] = words[j];
                   uniqueCount++;
               }
           }


           for (int k = 0; k < uniqueCount; k++) {
               System.out.print(uniqueWords[k] + " ");

           }
           System.out.println(" ");
           System.out.println("Do you want to add more . yes or no");
           choice = br.readLine();
       }while(choice.equals("yes"));

    }
}
