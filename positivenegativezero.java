import java.util.Scanner;

public class positivenegativezero {
  public static void main(String[] args) {
      Scanner sc=new Scanner((System.in));
      int n=sc.nextInt();
      int l[]=new int[n];
      for(int i=0;i<n;i++)       l[i]=sc.nextInt();
for(int j=0;j<l.length;j++)
      for(int i=0;i<l.length-1;i++){
          if(l[i]>=0&&l[i+1]<0){
              int tmp=l[i];
              l[i]=l[i+1];
              l[i+1]=tmp;

          }
          if(l[i]>0&&l[i+1]==0){
              int tmp=l[i];
              l[i]=l[i+1];
              l[i+1]=tmp;

          }
      }

    for (int i = 0; i < l.length; i++) System.out.print(l[i]+" ");
  }
}
