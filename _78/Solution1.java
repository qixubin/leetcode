package _78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qixubin on 2016/6/16.
 */
public class Solution1 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] argv){
        int[] nums = {1,2,3};
        Solution1 s1 = new Solution1();

        long aa = System.currentTimeMillis();
        List<List<Integer>> lli = s1.subsets(nums);
        System.out.println("it takes:" + (System.currentTimeMillis() -aa));


        System.out.println();
    }

}