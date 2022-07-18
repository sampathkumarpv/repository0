import java.util.Scanner;
public class substringmethod {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    int count=0,flag=0;
    for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)==s2.charAt(0))
                  for(int j=i,k=0;k<s2.length();j++,k++)
                  {
                        flag=1;
                        if(s1.charAt(j)==s2.charAt(k))     count++;
                  }
      if (flag == 1)
      {
          if (count == s2.length()) {
            System.out.println(i);
            break;
          } else {
            System.out.println(-1);
            break;
          }
      }
    }
  }
}
