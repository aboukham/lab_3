package lab8_9;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner         input = new Scanner(System.in);
        String          str;
        String          complement1 = "CGAT";
        String          complement2 = "GCTA";
        String          strand;
        int             i;
        int             j;

        while (true) {
            System.out.println("Enter a DNA strand:");
            strand = input.nextLine();
            if (strand.isEmpty())
                break;
            str = "";
            for (i = 0; i < strand.length(); i++){
                for (j = 0; j < complement1.length(); j++) {
                    if (strand.charAt(i) == complement1.charAt(j)) {
                        str += complement2.charAt(j);
                        break;
                    }
                }
                if (j == complement1.length()) {
                    System.out.println("The input value is not a DNA strand");
                    break;
                }
            }
            if (i == strand.length())
                System.out.println("The complement of the DNA strsnd \"" + strand + "\" is: " + str);
        }
    }
}
