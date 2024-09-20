import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> num = new ArrayList<>();
        
        for(int i = 0; i< numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(!num.contains(numbers[i] + numbers[j])){
                    num.add(numbers[i] + numbers[j]);
                }
            }
        }
        return num.stream()
            .sorted()
            .mapToInt(i -> i)
            .toArray();
    }
}