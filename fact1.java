public class fact1 {
    public static void main(String[] args) {
        int a[]={5,11,10,20,9,16,23};
        int count;
        int a2[]=new int[a.length*2];
        int l=0;

        for (int i=0;i<a.length;i++){
            count=2;
            for(int j=2;j<=a[i]/2;j++){
                if(a[i]%j==0)
                count++;
            }
            a2[l]=a[i];
            a2[l+1]=count;
            l+=2;
        }


        for(int p=1;p<a2.length;p++)
        for(int i=1;i<a2.length-2;i+=2)
        {
            if(a2[i]<a2[i+2]){
                int tmp =a2[i];
                a2[i]=a2[i+2];
                a2[i+2]=tmp;
                 tmp =a2[i-1];
                a2[i-1]=a2[i+1];
                a2[i+1]=tmp;

            }
        }
        for (int i=0;i<a2.length;i+=2){
            System.out.println(a2[i]+"-"+a2[i+1]);
        }
    }
}
