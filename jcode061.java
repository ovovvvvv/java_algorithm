/*
중복문자제거
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
import java.util.*;
class jcode061 {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
        }
            return answer;
    }

    public static void main(String[] args){
        jcode061 T =new jcode061();
        Scanner kb = new Scanner(System.in);
        String str= kb.next();
        System.out.print(T.solution(str));

    }
}

/*여기까지 작성했을 때 결과를 보면 4번째 k부 자기의 위치와 k라는 문자가 처음 발견된
위치가 다름. 자기와 같은 문자가 앞에서 이미 존재한다는 뜻 이제 코드를 추가해서 중복되는
알파벳들을 제거해야함
 */