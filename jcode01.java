import java.util.*;
class jcode01{
    public int solution(String str, char t){  //솔루션 함수를 줘서 입력이 매개변수로 넘어옴, 여기는 문자열이 오고 여기는 문자가 오나보다 하고 
        int answer=0;
        str=str.toUpperCase(); //스트링이 다 대문자가 되게끔 함
        t=Character.toUpperCase(t);
        //System.out.println(str + " " + t);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        jcode01 T = new jcode01();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);  //kb.next는 문자열을 받아오는거고 charAt하면 인덱스. 0 하면 0번째에 있는 문자를 가져와라 
        System.out.print(T.solution(str, c)); //solution을 호출 한것임
    }
}

