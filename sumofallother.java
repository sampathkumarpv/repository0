import java.util.Scanner;
public class sumofallother {
  public static void main(String[] args){
      Scanner sc=new Scanner((System.in));
      int sum=0;
      int n=sc.nextInt();
      int l[]=new int[n];
      for(int i=0;i<n;i++)       l[i]=sc.nextInt();

    for (int i = 0; i < n; i++) {
        sum=0;
      for (int j = 0; j < n; j++)    if (i != j)    sum += l[j];
      System.out.print(sum+" ");
          }
  }
}
