/* 팰린드롬 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 말함.
문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES" 아니면 "NO" 를 출력
==회문문자
ReplaceAll 정규식 이용
알파벳만 회문검사한다! 숫자, 특수문자는 ㄱㅊ
 */

import java.util.*;
class jcode081{
    public String solution(String s){
        String answer = "NO";
        s=s.toUpperCase().replaceAll("[^A-Z]","");  //정규식을 써야하기때문에 replaceAll을 사용
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";

        return answer;
    }
    public static void main(String[] args){
        jcode081 T = new jcode081();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}

