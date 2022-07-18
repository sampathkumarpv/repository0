public class sentencereverse {
  public static void main(String[] args) {
      String str="dont adapt yourself to everything";
      int len =str.length();
      int end=len;
      for (int i=len-1;i>=0;i--){

          if(str.charAt(i)==' '){
              for(int j=i+1;j<end;j++)
                      System.out.print(str.charAt(j));
              System.out.print(" ");
              end=i;
          }
          if(i==0) {
              for(int j=i;j<end;j++)
                  System.out.print(str.charAt(j));
          }
      }
  }
}



// output:
//kanaku thapu podatha punnaku poda poda
