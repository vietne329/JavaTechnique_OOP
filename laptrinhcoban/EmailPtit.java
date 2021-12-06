package self_study.laptrinhcoban;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailPtit {
    public static String ChuanHoa(String s) {
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] temp = s.split(" ");
        s = temp[temp.length-1];
        for (int i = 0; i < temp.length-1; i++) {
            s += String.valueOf(temp[i].charAt(0));
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        while(T-->0){
            String s = in.nextLine();
            s=ChuanHoa(s).trim()+'0';
            while(list.contains(s)){
                int temp=0;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                        temp = temp * 10 + (s.charAt(i) -'0');
                    }
                }

                s=s.replace(String.valueOf(temp),String.valueOf(temp+1));
            }
            list.add(s);
            int temp=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                    temp = temp * 10 + (s.charAt(i) -'0');
                }
            }
            if(temp ==0){
                s=s.replace(String.valueOf(temp)," ");
            }
            else
                s=s.replace(String.valueOf(temp),String.valueOf(temp+1));
            System.out.println(s.trim()+"@ptit.edu.vn");
        }
    }
}
