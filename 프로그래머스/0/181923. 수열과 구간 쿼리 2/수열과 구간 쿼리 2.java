import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 결과를 저장할 배열 초기화 (쿼리의 개수만큼)
        int[] answer = new int[queries.length];
        
        // 각 쿼리 처리
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0]; // 시작 인덱스
            int e = queries[i][1]; // 끝 인덱스
            int k = queries[i][2]; // 기준 값 k
            
            // 부분 배열 중 k보다 큰 값 중 가장 작은 값을 찾기 위해 초기값 설정
            int minValue = Integer.MAX_VALUE;
            
            // s에서 e 범위까지 탐색하면서 k보다 큰 값을 찾는다.
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    minValue = Math.min(minValue, arr[j]);
                }
            }
            
            // 만약 minValue가 초기값 그대로라면 (k보다 큰 값이 없었다면) -1 저장
            if (minValue == Integer.MAX_VALUE) {
                answer[i] = -1;
            } else {
                answer[i] = minValue;
            }
        }
        
        return answer;
    }
}