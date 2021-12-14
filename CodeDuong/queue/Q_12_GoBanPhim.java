
package queue;

import java.util.*;
public class Q_12_GoBanPhim {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        xuly(s);
    }
    private static void xuly(String s) {
        Stack<Character> stAdd = new Stack<>();
        Stack<Character> stSub = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c) {
                case '<':
                    if(!stAdd.isEmpty()){
                        char value = stAdd.peek();
                        stSub.add(value);
                        stAdd.pop();
                    }   break;
                case '>':
                    if(!stSub.isEmpty()){
                        char value = stSub.peek();
                        stAdd.add(value);
                        stSub.pop();
                    }   break;
                case '-':
                    if(!stAdd.isEmpty()){
                        stAdd.pop();
                    }   break;
                default:
                    stAdd.add(c);
                    break;
            }
        }

        while(!stSub.isEmpty()){
            stAdd.add(stSub.peek());
            stSub.pop();
        }

        for(int i = 0; i < stAdd.size(); i++){
            System.out.print(stAdd.elementAt(i));
        }
    }
}
