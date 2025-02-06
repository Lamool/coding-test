class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                answer = "login";
            } else if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) { 
                answer = "wrong pw";     
            } else if (!id_pw[0].equals(db[i][0]) && !answer.equals("wrong pw")) {
                answer = "fail";
            }
        }
        return answer;
    }
}



// 어떤 사람 풀이인데 이거 안 되는 거 아닌가?
// 만약 "wrong pw" 이거 다음에 로그인 성공인 거 나오면 이거 틀리는 거잖아.
// 이미 "wrong pw"을 반환하고 끝이니까.
// class Solution {
//     public String solution(String[] id_pw, String[][] db) {
//         String answer = "";

//         for(int i = 0; i < db.length; i++){
//             if(db[i][0].equals(id_pw[0])){
//                 if(db[i][1].equals(id_pw[1])){
//                     return "login";
//                 }
//                 return "wrong pw";
//             }
//         }
//         return "fail";
//     }
// }