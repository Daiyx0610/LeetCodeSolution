/*
	��ΪK�������飺
		����һ�����������һ������ k������Ҫ�ҵ��������к�Ϊ k ��������������ĸ�����
		ʾ��:
		����:nums = [1,1,1], k = 2
		���: 2 , [1,1] �� [1,1] Ϊ���ֲ�ͬ�������
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int start=0;startnums.length;++start){
            int sum = 0;
            for(int end=start;end=0;--end){
                sum += nums[end];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}