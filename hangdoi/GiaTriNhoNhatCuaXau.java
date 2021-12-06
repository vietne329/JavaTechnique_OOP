package self_study.hangdoi;
import java.util.Scanner;

public class GiaTriNhoNhatCuaXau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0){
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            solve(s,n);
        }
    }
    private static void solve(String s,int n) {
        int sum = 0;
        char[] s_char =  s.toCharArray();
        int[] s_count = new int[s.length()];

        int index = 0;
        for(int i = 0 ; i< s_char.length; i++){
            if(chuaTonTai(s,s_char[i],i)){
                int dem = count_char(s,s_char[i]);
                s_count[index] = dem;
                index++;
            }
        }
        int max = 0;
        for(int i = 0 ;i < s_count.length; i++){
            if(max < s_count[i]){
                max = s_count[i];
            }
        }

        for(int i= 0; i < n; i++){
            for(int j = 0 ; j < s_count.length; j++){
                if(j == s_count.length-1 && s_count[j] < max){
                    max--;
                    j=-1;
                }
                if(j >= 0){
                    if(s_count[j] == max){
                        s_count[j]--;
                        break;
                    }
                }

            }
        }

        for(int i= 0 ; i < s_count.length; i++){
            sum += s_count[i]*s_count[i];
        }
        System.out.println(sum);
    }

    public static int count_char(String s, char x){
        int dem = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == x){
                dem++;
            }
        }
        return dem;
    }

    public static boolean chuaTonTai(String s, char x,int k){
        for(int i = 0; i < k; i++){
            if(s.charAt(i) == x){
                return false;
            }
        }
        return true;
    }
}
