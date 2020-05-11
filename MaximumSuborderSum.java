/*
	给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
	示例:
	输入: [-2,1,-3,4,-1,2,1,-5,4],
	输出: 6
	解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

	这道题用动态规划的思路并不难解决，比较难的是后文提出的用分治法求解，但由于其不是最优解法，所以先不列出来
	动态规划的是首先对数组进行遍历，当前最大连续子序列和为 sum，结果为 ans
	如果 sum > 0，则说明 sum 对结果有增益效果，则 sum 保留并加上当前遍历数字
	如果 sum <= 0，则说明 sum 对结果无增益效果，需要舍弃，则 sum 直接更新为当前遍历数字
	每次比较 sum 和 ans的大小，将最大值置为ans，遍历结束返回结果
*/
/*
	foreach语句是for语句的特殊简化版本，但是foreach语句并不能完全取代for语句，
	然而，任何的foreach语句都可以改写为for语句版本。 
	foreach并不是一个关键字，习惯上将这种特殊的for语句格式称之为“foreach”语句。
	从英文字面意思理解foreach也就是“for 每一个”的意思。实际上也就是这个意思。 
	foreach的语句格式： 
	for(元素类型t 元素变量x : 遍历对象obj){ 
	     引用了x的java语句; 
	}
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums){
            if(sum > 0){
                sum += num;
            }else{
                sum = num;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}