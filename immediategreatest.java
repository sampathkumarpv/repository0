import java.util.Scanner;

public class immediategreatest {
        public static void main(String[] args) {
            int a[]=new int[20];
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int k=0;k<n;k++){
                a[k]=sc.nextInt();
            }
              //2 5 3 7 5
              for(int i=0;i<n;i++){
                  int max=0;
                  for(int j=i+1;j<n;j++){
                      if(a[j]>max){
                          max=a[j];
                      }
                      if(j==n-1){
                      }
                  }
                  for(int j=i+1;j<n;j++){
                    if(a[j]<max && a[j]>a[i]){
                        max=a[j];
                    }
              }
              if(max!=0 && max>a[i]){
                  a[i]=max;
              }
              else{
                  a[i]=-1;
              }
            
                           
                System.out.print(a[i]+" ");} 
            }
        }
        
    
