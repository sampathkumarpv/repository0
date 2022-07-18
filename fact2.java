public class fact2 {
    static int fact(int l)
    {
        int c=1,mul=1,val=1;
        for(int i=1;i<=l*l;i++)
        {
            if(i%l==0){
                val=1;
                mul++;}
            if(val*mul==l)
                c++;
            val++;}
        return c;
    }

    public static void main(String[] args) {
        int[] arr={5,11,10,20,9,16,23};
        int c=0;
        for(int i=0;i<(arr.length*arr.length)-1;i++)
        {
            if(c>=arr.length-1) c=0;
            if(fact(arr[c])<=fact(arr[c+1]))
            {
                int temp=arr[c+1];
                arr[c+1]=arr[c];
                arr[c]=temp;
            } c++;
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" "+fact(arr[i]));

    }

}