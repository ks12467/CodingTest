class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        int tmp = 0;
        boolean isPrime = false;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    tmp = nums[i] + nums[j] + nums[k];
                    isPrime = false;
                    for(int l=2;l<tmp;l++) {
                        if(tmp % l == 0) {
                            isPrime = true;
                            break;
                        }
                    }
                    if(isPrime == false) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}