import java.util.ArrayList;
import java.util.List;

public class code {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        if(direction.equals("right")) {
            list.add(0, list.get(list.size() -1));
            list.remove(list.size() -1);
        } else {
            list.add(list.get(0));
            list.remove(0);
        }
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);        
        }        

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
