package lab8_9;

import java.util.Locale;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String          str;
        String          lowerCase;
        String          res;

        while (true) {
            res = "is a palindrome";
            System.out.println("Enter a word:");
            str = input.nextLine();
            if (str.isEmpty())
                break;
            lowerCase = str.toLowerCase();
            for (int i = 0, j = lowerCase.length() - 1; i < j; i++){
                if (lowerCase.charAt(i) != lowerCase.charAt(j)) {
                    res = "is not a palindrome";
                    break;
                }
                j--;
            }
            System.out.println("The word \"" + str + "\" " + res + ".");
        }
    }
}
