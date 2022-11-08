//for문을 활용한 코드 

import java.util.*;
class jcode012{
    public int solution(String str, char t){
        int answer = 0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        for(char x : str.toCharArray()){ //tochararray가 str을 기반으로 문자 배열 객체를 생성함
            if(x==t) answer++;
    }
    return answer;
}

public static void main(String[] args){
    jcode012 T = new jcode012();
    Scanner kb = new Scanner(System.in);
    String str=kb.next();
    char c=kb.next().charAt(0);
    System.out.print(T.solution(str, c));
    }
}