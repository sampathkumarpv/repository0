import java.util.Scanner;
public class palindromewithspecialcharacters {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      boolean flag=true;
      String str="r?ace car";
      for(int i=0,j=str.length()-1;i<j;i++,j--){

      if((int)str.charAt(i)<=64 && (int)str.charAt(i)>=32){
        j++;continue;
      }
      if((int)str.charAt(j)<=64 && (int)str.charAt(j)>=32){
          i--;continue;
      }
      if(str.charAt(i)!=str.charAt(j)){
        System.out.println("Not A palindrome");
        flag=false;
        break;
      }
      }
    if (flag) System.out.println("Palindrome");
  }
}
