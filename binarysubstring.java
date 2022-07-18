import java.util.Scanner;
public class binarysubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        int flag=0;
        char ch[]=str.toCharArray();
        int zerocount=0,onecount=0,l;
        for(int i=0;i<ch.length;i++){
            if(ch[i]-'0'==0) zerocount++;
            if(ch[i]-'0'==1) onecount++;
        }
        if(zerocount<onecount) l=zerocount*2;
        else l=onecount*2;
        int zero=0,one=0;
        for(int b=l;b>0;b-=2)
        {

            for (int i = 0, j = b - 1; j < ch.length; i++, j++)
            {
                zero=0;
                one=0;
                for (int t = i; t <= j; t++) {
                    if (ch[t] - '0' == 0) zero++;
                    if (ch[t] - '0' == 1) one++;
                }
                if (zero == one) {
                    prt(ch, i, j);
                    flag=1;
                }

            }
            if(flag==0) continue;
            else break;

        }
    }
    public static void prt(char a[],int s,int e){
        for(int i=s;i<=e;i++){ System.out.print(a[i]);
        }
        System.out.println(" ");


    }
}
