//단어 뒤집기
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

import java.util.*;
class jcode041 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            //stringbuilder 문자열 받는 클래스 stringbuilder 안에 tostring 클래스도 있음
            //stringbuilder 객체가 여러개 만들어지지 않아서 메모리 낭비가 없다.
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){
        jcode041 T = new jcode041();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str=new String[n]; //스트링을 만든다. 동적으로
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : T.solution(n,str)){ //여기서 어레이리스트를 받아서 하나하나 대조
            System.out.println(x); //for each 문을 사용
        }
    }
}