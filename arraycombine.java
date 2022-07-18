import java.util.ArrayList;

public class arraycombine {
    public static void main(String[] args) {
        int ar1[]={3,7,10};
        int ar2[]={4,8,14};
        int len1=ar1.length;
        int len2=ar2.length;
        int ar3[]=new int[len1*2];
        ArrayList<Integer> ar=new ArrayList<Integer>(2*len1);
                    for(int m=0;m<len1;m++){
                        if(ar1[m]!='0'){
                        int tmp=ar1[m];

                        for(int k=0;k<len1;k++){
                            if(k!=m)
                            if(tmp>ar1[k])
                                if(ar.indexOf(ar1[k])==-1){
                                tmp=ar1[k];
                                 }
                            else System.out.println("fail");
                            if(tmp==ar1[k])
                                ar1[k]='0';
                        }
                        for(int k=0;k<len2;k++){

                            if(tmp>ar2[k])
                                if(ar.indexOf(ar2[k])==-1)
                                tmp=ar2[k];
                            if(tmp==ar2[k])
                                ar1[k]='0';
                        }
                            ar.add(tmp);

                        }
        }
        for(int m=0;m<len2;m++){
            if(ar2[m]!='0'){
                int tmp=ar2[m];
                for(int k=0;k<len1;k++){
                    if(ar1[k]!='0'){

                        if(tmp>ar1[k])
                            if(ar.indexOf(ar1[k])==-1)
                                tmp=ar1[k];

                        if(tmp==ar1[k])
                            ar1[k]='0';
                    }}
                System.out.println(tmp);
                for(int k=0;k<len2;k++){
                    if(k!=m&&ar2[k]!='0'){
                        if(tmp>ar2[k])
                            if(ar.indexOf(ar2[k])==-1)
                                tmp=ar2[k];
                        if(tmp==ar2[k])
                            ar1[k]='0';
                    }}
                if(ar.indexOf(tmp)==-1)
                ar.add(tmp);
            }
        }
        System.out.println(ar);

    }
}
