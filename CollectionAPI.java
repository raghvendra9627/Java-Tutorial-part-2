//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

public class CollectionAPI{
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(45);
        // nums.add(4);
        // nums.add(5);
        // nums.add(450);

        // System.out.println(nums.get(2));

        // for(int n : nums){
        //     System.out.println(n);
        // }

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(34);
        nums.add(340);
        nums.add(349);
        nums.add(34);
        nums.add(32);

        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
}