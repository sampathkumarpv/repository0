import java.util.Scanner;

public class pat11 {
    public static void main(String[] args) {
        String s[]=new String[20];
        Scanner sc=new Scanner(System.in);
        String temp;
        for(int k=0;k<6;k++){
            s[k]=sc.next();
        }

//        ....................SHORT.........................
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(s[i].length()>s[j].length()){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                    break;
                }
                else{
                    String m=s[i];
                    String n=s[j];
                    for(int v=0;v<m.length()-1;v++){
                    if(m.charAt(v)==n.charAt(v)){
                        continue;
                    }
                    else {
                        if((int)m.charAt(v)>(int)n.charAt(v)){
                            temp=s[i];
                            s[i]=s[j];
                            s[j]=temp;
                            break;

                        }
                    }

                        }
                }

            }
        }


//......................PRINT.......................................
        for(int k=0;k<6;k++){
            if(k==5){
                System.out.print(s[k]+" ");
            }
            else System.out.print("'"+s[k]+"'"+", ");

        }
    }
}
