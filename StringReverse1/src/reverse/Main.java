package reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your phrase: ");

        String phrase = scanner.nextLine();


        StringBuilder reversed = new StringBuilder();

        for (int i = phrase.length(); i > 0; i--){
            reversed.append(phrase.charAt(i - 1));
        }

        String temp = reversed.toString();

        System.out.println(temp);
    }
}
