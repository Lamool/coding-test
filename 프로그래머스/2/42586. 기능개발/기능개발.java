import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        int[] period = new int[length];
        int num = 0;
        int count = 0;
        int listNum = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // 각 기능의 작업 기간 구하기
        for (int i = 0; i < length; i++) {
            int leftProgress = 100 - progresses[i];
            
            while (leftProgress > 0) {
                leftProgress -= speeds[i];
                period[i]++;
            }
        }
        
        num = period[0];    // 첫 번째 기능 작업일을 num에 대입
        for (int i = 0; i < length; i++) {
            if (num >= period[i]) {     // 현재 작업일과 같거나 적게 걸리는 기간이라면 count 증가
                count++;
            } else {                    // 현재 작업일 보다 많이 걸리는 기간이라면 배포가 그 이후에 이뤄져야 하니
                list.add(count);        // 지금까지 배포될 수 있는 걸 센 기능들은 리스트에 추가
                num = period[i];        // 현재 작업일 num에 대입
                count = 1;              // count 1부터 다시 새로 세기
            }
        }
        
        // 기능 배포 수를 다 센 게 맞는지 확인하기 위해
        // 리스트의 값을 다 더하기
        for (int i = 0; i < list.size(); i++) {
            listNum += list.get(i);
        }
        
        // 리스트의 값 총합과 배열의 길이가 다르면 덜 추가됐다는 뜻이니 추가하기
        if (listNum != length) {
            list.add(count);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}