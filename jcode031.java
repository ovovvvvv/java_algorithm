import java.util.*;
class jcode031 {

    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE;  //계속 최댓값으로 갱신해야하므로 처음 값을 가장 작은값으로 초기화
        String[] s = str.split(" ");
        for(String x : s){ //x값에서 제일 긴 것만 찾으면 된다.
            int len=x.length();
            if(len>m){
                m=len;
                answer=x;  //더 긴 m의 값이 발견될때마다 answer에다가 넣어줌
            }
        }

        return answer;
    }

    public static void main(String[] args){
        jcode031 T = new jcode031();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}