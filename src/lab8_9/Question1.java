package lab8_9;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String  sent;
        int     count;
        String  vowels = "aeiou";

        while (true) {
            System.out.println("Enter a sentence:");
            sent = input.nextLine();
            if (sent.equals(""))
                break;
            System.out.println("Vowel counts for the sentence\n\t\t" + sent + ".");
            for (int i = 0; i < vowels.length(); i++){
                count = 0;
                for (int j = 0; j < sent.length(); j++)
                    if (sent.charAt(j) == vowels.charAt(i))
                        count++;
                System.out.println("# of \'" + vowels.charAt(i) + "\' : " + count);
            }
        }
    }
}
