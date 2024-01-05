import java.util.Scanner;
public class VowelOnly {
    // Write a method with a random string input, returns a String containing only vowels.
    // Example:
    // Input: “Hello World!” -> output: “eoo”
    //
    // Input: “Udacity Course” -> output: “Uaioue”
    public static String vowelOnly(String input){
        String vowel = "euoai";
        StringBuilder sb = new StringBuilder();
        for(char c: input.toCharArray()){
            if(vowel.contains(String.valueOf(c).toLowerCase())){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
