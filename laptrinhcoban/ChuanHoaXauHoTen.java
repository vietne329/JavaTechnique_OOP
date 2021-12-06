package self_study.laptrinhcoban;

import java.util.Scanner;

public class ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    public static String chuanHoa(String s){
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String temp[] = s.split(" ");
        String new_s = "";
        for(int i = 0 ; i < temp.length; i++){
            new_s+= String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1)+" ";
        }

        return new_s;
    }
}
