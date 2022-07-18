import java.util.Scanner;

public class postfix {
//   12345*+-+  ans=6
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int ne[]=new int[20];
    int t=0;
    for(int i=0;i<s.length();i++){
       if(Character.isDigit(s.charAt(i))){
           ne[i]=s.charAt(i)-'0';
       }
       else{
            t=ne.length;
    } 
    }    
    char ch[]=s.toCharArray();
        int sum=ch[0]-'0';
         for (int i = 0, j = t; i < t && j < s.length(); i++, j++){
            int c2=ch[i+1]-'0';

                switch (ch[j]){
                    case '+':
                        sum=sum+c2;

                        break;
                    case '-':
                        sum=sum-c2;
                        break;
                    case '*':
                        sum=sum*c2;
                        break;
                    default:
                        System.out.println("default");
                     }
    }
    System.out.print(sum);

}}
