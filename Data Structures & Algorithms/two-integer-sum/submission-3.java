class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [][]pairs=new int[n][2];

        for(int i=0;i<n;i++){
            pairs[i][0]=nums[i];
            pairs[i][1]=i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        int left=0;
        int right=n-1;

        while (left<right){
        int currsum=pairs[left][0]+pairs[right][0];
            if (currsum==target){
                int index1=pairs[left][1];
                int index2=pairs[right][1];

                if (index1<index2){
                    return new int[]{index1,index2};
                }
                else {
                    return new int[]{index2,index1};
                }
            }
            else if (currsum<target){
                left++;
            }
            else{
                right--;
            }
        }
    return new int[0];
    }
}
