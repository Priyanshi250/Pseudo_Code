package Coding_Question;
import java.util.Scanner;

public class Question1 {

    public int findStringCode(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            word = word.toUpperCase();
            int sum = 0;
            int i = 0, j = word.length() - 1;

            while (i <= j) {
                int left = word.charAt(i) - 'A' + 1;
                int right = word.charAt(j) - 'A' + 1;

                if (i == j) {
                    sum += left; // middle character for odd length
                } else {
                    sum += Math.abs(left - right);
                }
                i++;
                j--;
            }
            result.append(sum);
        }
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Question1 obj = new Question1();
        int code = obj.findStringCode(input);

        System.out.println("String Code: " + code);
        sc.close();
    }
}
