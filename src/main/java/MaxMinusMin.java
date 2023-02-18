
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int inf = Integer.MAX_VALUE;
        int max = -inf;
        int min = inf;
        
        for(int i = 0; i < nums.size(); i++){
            if( max < nums.get(i)){
                max = nums.get(i);
            }
        }
        for(int i = 0; i < nums.size(); i++){
            if( min > nums.get(i)){
                min = nums.get(i);
            }
        }
        int diff = max - min;
        return diff;
    }
}
