import java.util.Scanner;
public class diamondpattern1 {
  public static void main(String[] args) {
      Scanner cs=new Scanner(System.in);
    System.out.println("Enter size");
      int n=cs.nextInt();
    for(int i=0;i<=n/2;i++){
        for(int j=0;j<n;j++){
            if(j>=n/2-i && j<=n/2+i)        System.out.print("* ");
            else                            System.out.print("  ");
        }
        System.out.println("");
    }
    for(int i=n/2-1;i>=0;i--){
        for(int j=0;j<n;j++){
            if(j>=n/2-i && j<=n/2+i)        System.out.print("* ");
            else                            System.out.print("  ");
          }
        System.out.println("");
      }
  }
}




//           *
//          ***
//         *****
//          ***
//           *
