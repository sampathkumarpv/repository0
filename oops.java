import java.util.Scanner;
public class oops
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  um=0,lm=0;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                if(i==j&&a[i][j]==0){
                    System.out.println("not triangular");
                    System.exit(0);
                }

                if(i>j&&a[i][j]==0 ||i<j&&a[i][j]!=0 )      lm+=1;
                if(i<j&&a[i][j]==0 ||i>j&&a[i][j]!=0)       um+=1;
            }
        System.out.println((um==0) ? "Upper triangular matrix":(lm==0)? "lower triangular matrix" :"Not a triangular matrix");
        }
}
