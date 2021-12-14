
package recursive;
import java.util.* ;
public class R2_LietKeTapCon {
     static int n, b[] = new int[30];
    static String s;
    static ArrayList<String> kq = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner (System. in);
        int t = in.nextInt();
        while (t-->0) {
            b=new int[30];
            kq =new ArrayList<>();
            n=in.nextInt(); s = in.next();
            quaylui(1);

            Collections. sort (kq);
            for (String s:kq){
                System.out.print(s + " ");
            }

            System. out.println ();
        }
    }

    public static void quaylui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i ==n){
                xuly();

            } else quaylui(i+1);
        }
    }
    public static void xuly() {
        String tmp = "";
        for (int i = 1; i <= n; i++) {
            if (b[i] == 1)
                tmp = tmp + s.charAt(i - 1);
        }
        kq.add(tmp);
    }
}
