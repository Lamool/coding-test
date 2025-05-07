import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // i가 arr의 길이보다 작으면 반복
        for (int i = 0; i < arr.length;) {
            if (list.size() == 0) {  // 만약 list가 빈 리스트라면 arr[i]를 list에 추가하고 i에 1을 더한다
                list.add(arr[i]);
                i++;
            } else {    // 만약 list에 원소가 있고
                if (list.get(list.size() - 1) == arr[i]) {    // list의 마지막 원소가 arr[i]와 같으면
                    list.remove(list.size() - 1);             // list의 마지막 원소를 list에서 제거하고
                    i++;                                        // i에 1을 더한다
                } else {    // list의 마지막 원소가 arr[i]와 다르면
                    list.add(arr[i]);    // list의 맨 마지막에 arr[i]를 추가하고
                    i++;                 // i에 1을 더한다                
                }
            }
        }   // for문 end
        
        // 작업을 마친 후, 만들어진 리스트의 길이 체크
        if (list.size() == 0) {   // 만약 빈 리스트라면
            list.add(-1);     // 리스트에 -1 값 추가
        }
        
        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        
        // 리스트의 값을 answer에 순서에 맞게 대입해주기
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}