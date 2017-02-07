/**
  * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
  * For example,
  * Given nums = [0, 1, 3] return 2.
  * Note:
  * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity? 
  * 解法思路：主要考虑到了时间和空间复杂度的问题，所以在数组下标上下功夫。判断一个数字是否出现过得方法是，如果数字出现过，就把该数字做下标的
  * 数组中数加n+1，也就是如果3出现过，nums[3]+=(n+1)；这样，后面采用nums[i]%(n+1)就能获取到数组原始的数。还有个注意点，数组中会有下标为n的点
  * 所以，需要对值为n的点进行特殊处理。最后结果就是，所有出现过的下标，该下标对应值都会加过n+1。
  */

public class Solution {
    public int missingNumber(int[] nums) {
        if(nums==null || nums.length==0){
            return -1;
        }
        int n=nums.length;  //数组长度
        //int v=-1;   //记录为n的点
        for(int i=0;i<n;i++){
            if(nums[i]%(n+1)==n){
                //v=i;
                continue;
            }
            nums[nums[i]%(n+1)]+=(n+1);
        }
        
    
        for(int i=0;i<n;i++){
            if(nums[i]<= n){
                  return i;
            }
        }
        
        return n;
    }
}
