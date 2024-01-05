import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static boolean twoSum(int[] nums, int target) {
        Set<Integer> map = new HashSet<>();

        for(int num:nums){
            if(map.contains(num)){
                return true;
            }
            map.add(target-num);
        }
        return false;
    }
}
