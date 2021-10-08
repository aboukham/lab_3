package lab8_9;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String  str;
        int     count;

        while (true) {
            count = 0;
            System.out.println("Enter a string:");
            str = input.nextLine();
            if (str.equals(""))
                break;
            for (int i = 0; i < str.length(); i++)
                if (Character.isUpperCase(str.charAt(i)))
                    count++;
            System.out.println("The number of uppercase letters an \"" + str + "\" is: " + count);
        }
    }
}
