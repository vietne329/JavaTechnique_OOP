package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class SuaLaiDayNgoac {
static int count;
    public static int check(String temp){
        if(temp.isEmpty()) return 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<temp.length();i++){
            char current = temp.charAt(i);
            if( current=='(')
            {
                if( i == temp.length()-1){
                    count++;
                    break;
                }
                st.push(current);
            }
            if (current == ')'){
                if(st.isEmpty()){
                    count++;
                    st.push('(');
                    continue;
                }else{
                    st.pop();
                }
            }
        }
        count+= st.size()/2;
        return count;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-->0){
            count = 0;
            String temp = in.nextLine();
            System.out.println(check(temp));
        }
    }
}
