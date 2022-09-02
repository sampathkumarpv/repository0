//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

package Pattern;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        for (int i = 0; i < n + n - 1; i++) {

            if (i<n)
            for (int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }
            else
            for (int j = 0; j <n-(i-n)-1 ; j++)
            {
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
}

