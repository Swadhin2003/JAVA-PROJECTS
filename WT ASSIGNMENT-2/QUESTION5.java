import java.util.*;
public class QUESTION5 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        String replacedString = inputString.replace("proud", "happy");
        System.out.println("Replaced string: " + replacedString);
        String trimmedString = inputString.trim();
        System.out.println("Trimmed string: " + trimmedString);
        String[] splittedString = inputString.split(" ");
        System.out.println("Splitted string:");
        for (String word : splittedString) 
        {
            System.out.println(word);
        }
        char character = inputString.charAt(5);
        System.out.println("Character at index 5: " + character);
        String subString = inputString.substring(14, 25);
        System.out.println("Substring from index 14 to 24: " + subString);
    }
}