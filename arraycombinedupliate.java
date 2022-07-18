import javax.swing.plaf.synth.SynthOptionPaneUI;
public class arraycombinedupliate{
  public static void main(String[] args) {
      int a[]={1,6,5,7,3};
      int b[]={2,2,6,8,-1};
      int c[]=new int[a.length+b.length];
      int p=0;
      int tmp=0;


      for (int i=0;i<a.length;i++){
          tmp=a[i];
          if(contain(c,tmp)==0) continue;
          for(int n=0;n<a.length;n++){
              if(a[n]<tmp && contain( c,a[n])==1)
              tmp=a[n];
          }
          for(int n=0;n<b.length;n++){
              if(b[n]<tmp && contain( c,b[n])==1)
              tmp=b[n];
          }
          c[p]=tmp;
          p++;
      }


      for (int i=0;i<b.length;i++){
          tmp=b[i];
          if(contain(c,tmp)==0)continue;
          for(int n=0;n<b.length;n++){
              if(b[n]<tmp && contain( c,b[n])==1)
                  tmp=b[n];
          }
          for(int n=0;n<a.length;n++){
              if(a[n]<tmp && contain( c,a[n])==1)
                  tmp=a[n];
          }
          c[p]=tmp;
          p++;
      }

    for (int i = 0; i < a.length+b.length ; i++)     System.out.println(c[i]);
  }


static int contain(int c[],int n){
      for(int i=0;i<c.length;i++){
          if(n==c[i]) return 0;
      }
      return 1;
  }


}

//lkguyzhghfjguh.hv


