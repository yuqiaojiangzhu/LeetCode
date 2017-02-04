public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null || nums.length==0){   
            return 0;
        }
        
        int num=nums[0];    //num是当前记录数
        int len=1,beg=0;   //分别记录当前记录数的连续长度和初始位置
        int maxLen=len,maxBeg=beg;     //分别记录最大连续数长度和初始位置
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num){
                len++;
                if(len>maxLen){
                    maxLen=len;
                    maxBeg=beg;
                }
            }else{
                num=nums[i];
                beg=i;
                len=0;
            }
        }
        return maxLen;
    }
}
