/* 숫자만 추출 0,1,2,0,5 가 추출됐을 경우 출력은 자연수1205로 나온다.*/
/* x>=48 && x<=57 x는 char형 숫자로 48은 0, 57은 9를 뜻함. 아스키 */
import java.util.*;
class jcode091 {
    public int solution(String s) { //solution은 문자의 길이가 얼마인지, 숫자로만 구성되어있는지 확인해주는 함수
        int answer=0;
        for(char x : s.toCharArray()){
            if(x>=48 && x<=57) answer=answer*10+(x-48);
        }

        return answer;
    }

    public static void main(String[] args){
        jcode091 T = new jcode091();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}