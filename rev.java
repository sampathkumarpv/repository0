import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9,10,11};
        int n=sc.nextInt();
        int first=0, last=n-1,temp;
        int c=first,d=last;
        System.out.println("a.len"+a.length/n);
        for(int i=1;i<=a.length/n+1;i++)
        {
            if(i==a.length/n+1)
            {
                last=(a.length)-1;
            }


            for(int j=0;j<=n/2;j++)
            {
                if(first>last){
                    break;
                }
                temp=a[first];
                a[first]=a[last];
                a[last]=temp;
                first++;
                last--;
            }
            c=c+n;
            first=c;
            d=d+n;
            last=d;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
