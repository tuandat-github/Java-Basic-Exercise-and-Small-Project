import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateWordsFrequency {
    public static void main(String[] args){
    List<String> input = Arrays.asList("abc", "bcd", "abc");
    calcWordsFreq(input);
    }

    public static void calcWordsFreq(List<String> input){
        HashMap<String, Integer> freqMap = new HashMap<>();

        for(String str : input){
            freqMap.put(str, freqMap.getOrDefault(str, 0)+1);
        }

        for (String key : freqMap.keySet()) {
            System.out.println(key +"|"+ freqMap.get(key));
        }
    }
}
