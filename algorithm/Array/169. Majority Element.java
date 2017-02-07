/**
 * 问题：Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 解法：采用HashMap，时间复杂度为n，但是空间复杂度还是为n
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}
