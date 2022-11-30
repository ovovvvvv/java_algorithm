import java.util.*;
class jcode072{
    public String solution(String str){
        String answer="NO";
        String tmp= new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";//뒤집기
        return answer;
    }

    public static void main(String[] args){
        jcode072 T = new jcode072();
        Scanner kb= new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}