//method를 사용한 코드
//parseint도 사용 ㅎㅎ
import java.util.*;
class jcode092 {
    public int solution(String s) {
        String answer="";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) answer+=x; //이게 참이면 숫자이다.
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        jcode092 T = new jcode092();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
