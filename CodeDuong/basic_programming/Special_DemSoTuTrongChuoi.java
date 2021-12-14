
package basic_programming;

import java.util.* ;

public class Special_DemSoTuTrongChuoi {
    public static final char SPACE =' ' ;
     public static final char TAB ='\t' ;
      public static final char BREAK_LINE ='\n' ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System .in);
        String input = in.nextLine() ;
        System.out.println("Total words in sentence are :  "+ countWords(input));
    }
    
    public static int countWords(String input){
        if(input == null) {
             return -1 ;
        }
          int count = 0  ;
          boolean notCounted = true ;
          for(int i = 0; i<=input.length() ; i++){
              if(input.charAt(i) != SPACE && input.charAt(i) != TAB &&input.charAt(i) != BREAK_LINE){
                 if(notCounted){
                      count ++ ;
                  notCounted = false ;
                 }
              }else{
                  notCounted= true ;
              }
          }
          return count ;
    }
}
