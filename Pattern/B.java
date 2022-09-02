//            *
//           ***
//          *****
//         *******
//        *********



package Pattern;

public class B {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < 5; i++) {
            for (int j =0 ; j <n+i+1 ; j++)
                if(j<n-i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.println(" ");
        }
    }
}
