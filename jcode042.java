import java.util.*;
class jcode042{
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x : str){ //X가 study
            char[] s=x.toCharArray();
            //여기서 s는 study라는 단어가 있으면 01234 로 번호가 매겨지는 배열임
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s); //valueof는 static으로 선언된 클래스메소드다
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args){
        jcode042 T = new jcode042();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}