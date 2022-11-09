//아스키넘버로 짠 코드
import java.util.*;
class jcode022 {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
           if(x>=97 && x<=122) answer+=(char)(x-32); //32를 빼 주면 소문자가 대문자로 변함(아스키번호가)
           else answer+=(char)(x+32); //대문자일때는 32더해서 소문자로 
           // if(x>=65 && x<=90) System.out.println(x); //이렇게만 쓰면 소문자만 출력
        }
        return answer;
    }    

    public static void main(String[] args){
        jcode022 T = new jcode022();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
