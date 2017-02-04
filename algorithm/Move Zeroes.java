/**
  * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
  *For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
  *Note:
  * You must do this in-place without making a copy of the array.
  * Minimize the total number of operations.
  *
  */

public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        int len=nums.length;    //输入数组长度
        int n=0;    //已经往后加了多少0
        for(int i=0;i<len-n;i++){
            if(nums[i]==0){
                for(int j=i;j<len-1-n;j++){
                    nums[j]=nums[j+1];
                }
                nums[len-1-n]=0;
                n++;
                i--;
            }
            if(n==len){ //所有的数都为0
                return;
            }
        }
    }
}
