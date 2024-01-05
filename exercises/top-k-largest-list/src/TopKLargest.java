import java.util.List;
import java.util.TreeSet;

public class TopKLargest {
    public static List<Integer> topKLarger(int[] arr, int k){
        TreeSet<Integer> treeset = new TreeSet<>();

        for(int num: arr){
            treeset.add(num);
            if(treeset.size()>k){
                treeset.pollFirst();
            }
        }

        return treeset.stream().toList();
    }
}
