/*Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]*/
import java.util.*;
class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        //List<Integer>l1=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<Math.pow(2,n);i++){
            List<Integer>l1=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    l1.add(nums[j]);
                }
                // if(!l.contains(l1)){
                //   l.add(l1);
                // }
            }
            l.add(l1);
        }
        return l;
    }
}