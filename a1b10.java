import java.util.Scanner;
public class a1b10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int len = str.length();
    for (int i = 0; i <len; i+=2) {
        int n=0;
        if(str.charAt(i+1)>='0'&&str.charAt(i+1)<='9'){
            n=n+(str.charAt(i+1)-'0');
        }
        if((i+2)<len)
        if(str.charAt(i+2)>='0'&&str.charAt(i+2)<='9'){
            n=(n*10)+(str.charAt(i+2)-'0');
            i+=1;
        }
        for (int j=0;j<n;j++){
           System.out.print(str.charAt(i));
        }
    }
  }
}