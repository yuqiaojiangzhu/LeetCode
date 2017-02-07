/*
 *Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 *  The input array will only contain 0 and 1.
 *  The length of input array is a positive integer and will not exceed 10,000
 *
 */

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null || nums.length==0){   
            return 0;
        }
        
        int len=0;   //分别记录当前记录数的连续长度
        int maxLen=len;     //分别记录最大连续数长度
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                len++;
                if(len>maxLen){
                    maxLen=len;
                }
            }else{
                len=0;
            }
        }
        return maxLen;
    }
}
