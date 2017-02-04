/**
  *Given a non-empty array of integers, return the third maximum number in this array.
  *If it does not exist, return the maximum number. The time complexity must be in O(n).
  */

public class Solution {
    public int thirdMax(int[] nums) {
        long first=(long)Integer.MIN_VALUE-1,second=first,third=first;   //定义first、second、third并置为最小值
        int len=nums.length;
        
        for(int i=0;i<len;i++){
            if(nums[i]==first || nums[i]== second || nums[i]== third){
                continue;
            }
            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }else if(nums[i]>second){
                third=second;
                second=nums[i];
            }else if(nums[i]>third){
                third=nums[i];
            }
        }
        
        if(third!=(long)Integer.MIN_VALUE-1){
            return (int)third;
        }else{
            return (int)first;
        }
    }
}
