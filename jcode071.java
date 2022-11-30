//회문 문자열:앞에서 읽을 때나 뒤에서 읽을 때가 같은 문자열
//회문문자열이면 yes 아니면 no를 출력하는 프로그램을 작성하세요
//대소문자를 구분하지 않습니다.

import java.util.*;
class jcode071 {
    public String solution(String str){
        String answer="YES";
        str=str.toUpperCase();
        int len=str.length();
        for(int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return "NO";
        }
                //GOOG 라면 len은 4고 각각 순서는 0123이므로
                // len-i-1을해야함
        return answer;
    }

    public static void main(String[] args){
        jcode071 T = new jcode071();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
