package MidTermExam;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    //1) write a method get3FirstWords() that takes a sentence and return the 3 first words
    //in this sentence. if input sentence has less than 3 words, return this sentence.

    public static String get3FirstWords(String sentence){
        String  sent = sentence.trim();
        String  str = "";
        int     index = 0;
        int     j = 0;

        for (int i = 0; i < sent.length(); i = index + 1){
            index = sent.indexOf(" ", i);
            if (index == -1)
                return  sentence;
            str += sent.substring(i, index) + " ";
            j++;
            if (j == 3)
                return str;
        }
        return str;
    }

    //2) write a method guessNumber() that asks the get the randomly number between 1 and 10
    // and asks the user to guess this number as input.
    //Example:
    //if random number = 6
    //Hello, please guess a number between 1-10.
    //4
    //No, try again.
    //5
    //No, try again
    //6
    //Yes, you got it.

    public static void guessNumber(){
        Scanner     input = new Scanner(System.in);
        Random      rand = new Random();
        int         guessNumber;
        int         randomNumber;

        randomNumber = rand.nextInt(10) + 1;
        System.out.println("Hello, please guess a number");
        guessNumber = input.nextInt();
        while (guessNumber != randomNumber){
            System.out.println("No, try again");
            guessNumber = input.nextInt();
        }
        System.out.println("Yes, you got it");
    }

    //1) write a method sliceOut() that takes a sentence and a number. this method should return the 3 first words
    //the word in the sentence which according to the number.

    public static String sliceOut(String sentence, int n){
        String  sent = sentence.trim();
        String  str = "";
        int     index = 0;
        int     j = 0;

        for (int i = 0; i < sent.length(); i = index + 1){
            index = sent.indexOf(" ", i);
            if (index == -1)
                return  sentence;
            str = sent.substring(i, index);
            j++;
            if (j == n)
                break;
        }
        return str;
    }
    public static void main(String[] args){
        System.out.println(get3FirstWords("abdelaziz aboukhame hi man         "));
        guessNumber();
        System.out.println(sliceOut("hi", 1));
    }
}
