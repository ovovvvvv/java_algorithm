/*
중복문자제거
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
import java.util.*;
class jcode062 {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++) {
           // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i)
                answer+=str.charAt(i);
                //이게 거짓이면 중복된 문자
            //참일때만 answer로 넘어감
        }
        return answer;
    }

    public static void main(String[] args){
        jcode062 T =new jcode062();
        Scanner kb = new Scanner(System.in);
        String str= kb.next();
        System.out.print(T.solution(str));

    }
}

//indexOf 한 번 사용해보려고 만든 문제~