//indexof, subtring 을 이용한 코드

import java.util.*;
class jcode032 {
    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0,pos);  //tmp가 it 이 됨
            int len=tmp.length();
            if(len>m){ //같다(=)를 사용하면 안됨, 크다(>)를 사용해야 계속 앞쪽 단어 유지
                m=len;
                answer=tmp; //계속 갱신함
            }
            str=str.substring(pos+1);
            //pos가 띄어쓰기를 가리키고 있으므로 it 다음 문장들을 가르킴
        }
        if(str.length()>m) answer=str; //str이 마지막 단어임
        return answer;
    }

    public static void main(String[] args){
        jcode032 T = new jcode032();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}
