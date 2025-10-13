import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //this is the answer question 1.

                Scanner input = new Scanner(System.in);
                System.out.println("Enter weight : ");
                double weight = input.nextDouble();
                System.out.println("Enter height : ");
                double height = input.nextDouble();

                double bmi = weight / (height * height);
                System.out.println( bmi);

        //this is the answer question 2.

        System.out.println("Enter obtained marks: ");
        double obtained = input.nextDouble();
        System.out.println("Enter total marks: ");
        double total = input.nextDouble();

        double percentage = (obtained / total) * 100;
        System.out.println(" percentage marks is " + percentage);

        //the is answer question 3.


        System.out.print("Enter amount : ");
        double amount = input.nextDouble();
        System.out.print("Enter exchange : ");
        double rate = input.nextDouble();

        double converted = amount * rate;
        System.out.println("converted amount is " + converted);


        //the is answer question 4.
        System.out.println("Enter  string: ");
        String text = input.nextLine();

        int length = text.length();
        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Length  string: " + length);
        System.out.println("Reversed string: " + reversed);

        //the is answer question 5.

        System.out.println("Enter sentence: ");
        String sentence = input.nextLine();

        System.out.println("Enter start index: ");
        int start = input.nextInt();
        System.out.println("Enter end index: ");
        int end = input.nextInt();

        String sub = sentence.substring(start, end);
        System.out.println("Extracted substring: " + sub);

        //the is answer question 6.

        System.out.print("Enter  sentence: ");
        String sentencee = input.nextLine();
        System.out.print("Enter keyword: ");
        String keyword = input.nextLine();

        if (sentence.contains(keyword)) {
            System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
        } else {
            System.out.println("Keyword \"" + keyword + "\" is NOT present in the sentence.");

        }
        //the is answer question 7.


        System.out.print("Enter sentence: ");
        String sentenc = input.nextLine();
        System.out.print("Enter word  replace: ");
        String word = input.nextLine();
        System.out.print("Enter replacement word: ");
        String replacement = input.nextLine();

        String modified = sentence.replace(word, replacement);
        System.out.println("Modified sentence: " + modified);

        //the is answer question 8.
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal (ignoring case).");
        } else {
            System.out.println("Strings are NOT equal.");
        }











    }
        }


