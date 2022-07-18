import java.util.Scanner;

public class oddevensplit {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
    for (int i = 0; i < n; i++)   a[i]= sc.nextInt();

    for(int j=0;j<n-1;j++)
        for(int i=0;i<n-1;i++){

        if(a[i]%2==0 && a[i+1]%2!=0){
            int tmp=a[i];
            a[i]=a[i+1];
            a[i+1]=tmp;
        }
    }
    for (int i = 0; i < n; i++) System.out.print(a[i]+" ");
  }
}
