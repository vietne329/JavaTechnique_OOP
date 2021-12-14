
package Lop_Hoc_Phan_2;
import java.util.* ;
public class Main {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Lop> list = new ArrayList<>();
        while(n-- >0){
            Lop lop = new Lop(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(lop);
        }
        Collections.sort(list);
        int  number = Integer.parseInt(in.nextLine());
        String[] temp = new String[number];
        for(int i=0;i<number;i++){
            temp[i] = in.nextLine();
        }

        for(int i=0;i<number;i++){
            String name="";
            ArrayList<String> result = new ArrayList<>() ;
            for(int j=0;j<list.size();j++){
                if(list.get(j).getTengv().equals(temp[i])){
                    String temppp =list.get(j).getMa()+" "+list.get(j).getTen()+" "+list.get(j).getNhom();
                    result.add(temppp);
                    name = list.get(j).getTengv();
                }
            }
            System.out.println("Danh sach cho giang vien "+name+":");
            for(String sss:result){
                System.out.println(sss);
            }
        }

    }

}


