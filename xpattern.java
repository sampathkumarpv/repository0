import java.util.Scanner;
public class xpattern {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      int len=str.length();
      for(int i=0;i<len;i++){
          for(int j=0;j<len;j++){
              if(j==i)                      System.out.print(str.charAt(j));
              else if (j == (len-1) - i)    System.out.print(str.charAt(j));
              else                          System.out.print(" ");
          }
          System.out.println("");
      }
  }
}
