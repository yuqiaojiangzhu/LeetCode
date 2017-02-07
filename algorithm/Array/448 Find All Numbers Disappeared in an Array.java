/**
  *Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
  *Find all the elements of [1, n] inclusive that do not appear in this array.
  *Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
  * 灵活使用%非常重要，尤其当空间复杂度要求比较高的时候
  */

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();    //需要返回的List
        if(nums==null || nums.length==0){
            return result;
        }
        
        int len=nums.length;    //数组长度
        for(int i=0;i<len;i++){
            nums[(nums[i]-1)%len]+=len;
        }
        
        for(int i=0;i<len;i++){
            if(nums[i]-1<len) {
                result.add(i+1);
            }  
        }
        return result;
    }
}
