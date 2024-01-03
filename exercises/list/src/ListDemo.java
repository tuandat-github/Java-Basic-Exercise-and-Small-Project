import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListDemo {
    public static void main(String[] args){
        List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb","eeee");
        for (List<String> lst: groupString(input)){
            System.out.println(lst);
        }
    }
//    Please complete the coding exercise for List.
//    Give a list of strings, all in lowercase, and all start with an alphabet character,
//    please group them based on their first character. If the first character is a,
//    group them in a list 0. If the first character is ‘b’, group them in a list 1; other characters,
//    group them in a list 2.
//    Example1 : input: {“bcd”, “abc”, “cde”}, output: [{“abc”}, {“bcd”}, {“cde”}]

//    Example2: Input: List: {“abc”, “bcd”, “bbb”, “ace”, “snb”, “aaaa”, “bbbbb”, “eeee”}
//    Output: [{“abc”, “ace”, “aaaa”}, {“bcd”, “bbb”, “bbbb”}, {“snb”, “eeee”}]

    public static List<List<String>> groupString(List<String> input) {
        List<List<String>> result = new ArrayList<List<String>>();

        for(int i =0;i<3;i++){
            result.add(new ArrayList<String>());
        }

        for(String str: input){
            if(str.charAt(0)=='a'){
                result.get(0).add(str);
            }
            else if(str.charAt(0)=='b'){
                result.get(1).add(str);
            }
            else{
                result.get(2).add(str);
            }
        }
        return result;

    }
}
