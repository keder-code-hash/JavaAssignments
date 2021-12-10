package Problems_CP;
//You are a professional robber planning to rob houses along a street. 
//Each house has a certain amount of money stashed. All houses at this place are arranged in a circle.
//That means the first house is the neighbor of the last one. 
//Meanwhile, adjacent houses have a security system connected,
//and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house,
//return the maximum amount of money you can rob tonight without alerting the police.
//
// 
//
//Example 1:
//
//Input: nums = [2,3,2]
//Output: 3
//Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
/**
 * include and exclude logic
 * 
 * */
public class Rob {
	public static int calRob(int start,int end,int[] nums){
        int exclude=0,include=0,temp=0;
        for(int i=start;i<=end;i++){
            temp=Math.max(include,exclude);
            include=exclude+nums[i];
            exclude=temp;
        }
        return Math.max(exclude,include);
    }
    public static int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        } 
        return Math.max(calRob(0,nums.length-2,nums),calRob(1,nums.length-1,nums));
    }
	public static void main(String[] args) { 
//		Arrays
	}

}
