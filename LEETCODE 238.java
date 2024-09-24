class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int i,j,pre=1,post=1;
        for(i=0;i<ans.length;i++)
        {
            ans[i]=1;
        }
        for(i=0;i<nums.length;i++)
        {
            ans[i]*=pre;
            pre*=nums[i];
        }
        for(i=nums.length-1;i>=0;i--){
            ans[i]*=post;
            post*=nums[i];
        }
        return ans;

        
    }
}
