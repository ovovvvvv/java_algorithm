//특정 문자 뒤집기
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//lt와 rt를 교환함과 동시에 증가시킨다. 특수문자를 가리킬경우 바로 증가시킨다.
//lt가 rt보다 작을 때 까지만 교환해라
import java.util.*;
class jcode051 {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray(); //스트링을 기반으로한 문자 배열이 하나 생성
        int lt=0, rt=str.length()-1; //lt, rt 모두 0번 인덱스부터 시작
        //s의 첫 번째 문자를 lt가, 마지막 문자를 rt가 가리킴
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;//알파벳이 아닐때 이 식이 참이 됨
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);

        return answer;
    }

    public static void main(String[] args){
        jcode051 T = new jcode051();
        Scanner kb = new Scanner(System.in);
        String str= kb.next();
        System.out.println(T.solution(str));
    }
}