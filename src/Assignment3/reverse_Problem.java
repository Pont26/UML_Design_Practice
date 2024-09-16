package Assignment3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class reverse_Problem {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice ="";

        do {
            System.out.print("Enter a sentence: ");
            String input = br.readLine();

            int count = 0;
            String[] words = new String[20];
            String currentWord = "";

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch != ' ') {
                    currentWord += ch;
                } else {
                    words[count] = currentWord;
                    count++;
                    currentWord = "";
                }
            }

            if (!currentWord.equals("")) {
                words[count] = currentWord;
                count++;
            }
            for(int i = count - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
            System.out.println("Do you want to do more. yes or no");
            choice = br.readLine();
        }while (choice.equals("yes"));
    }
}



