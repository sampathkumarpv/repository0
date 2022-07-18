import java.util.ArrayList;
public class arraycombine1 {
    public static void main(String[] args) {
        int ar1[]={3,7,10};
        int ar2[]={4,8,14};
        int len1=ar1.length;
        int len2=ar2.length;
        int ar3[]=new int[len1*2+2];
        int e,f;
        ArrayList<Integer> ar=new ArrayList<Integer>(2*len1);
        if(ar1[1]<ar1[ar1.length-1])  e=-1;
        else e=1;
        if(ar2[1]<ar1[ar2.length-1])  f=-1;
        else f=1;
        int flag=0;
        int s1,s2,e1,e2;


        if(e==-1 && f==-1) {s1=0;  s2=0;  e1=ar1.length-1;  e2=ar2.length-1;}
        else if(e==-1 && f==1) {s1=0;  s2=ar2.length-1;  e1=ar1.length;   e2=0;}
        else if(e==1 && f==-1) {s1=ar1.length-1;   s2=0;   e1=0;   e2=ar2.length;}
        else  {s1=ar1.length-1;   s2=ar2.length-1;  e1=0;   e2=0;}

            for(int i=s1;;i++) {
                int tmp = ar1[i];

            }








}
}
