import java.util.Scanner;
class codingmart1
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][] = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 2, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1}
        };
//    System.out.println(a.length);
        int x =sc.nextInt(), y = sc.nextInt(), newColor =sc.nextInt();
        first(a, x, y, newColor);
        printer(a);
    }





    static void first(int screen[][], int x, int y, int newColor)
    {
        int oldColor = screen[x][y];
        if(oldColor==newColor) return;
        cd(screen, x, y, oldColor, newColor);
    }


    static void cd(int a[][], int x, int y,
                   int oldColor, int newColor)
    {
        if (x < 0 || x >= a.length || y < 0 || y >= a.length || a[x][y] != oldColor)
            return;
        a[x][y] = newColor;
        cd(a, x+1, y, oldColor, newColor);
        cd(a, x+1, y-1, oldColor, newColor);
        cd(a, x+1, y+1, oldColor, newColor);

        cd(a, x-1, y, oldColor, newColor);
        cd(a, x-1, y+1, oldColor, newColor);
        cd(a, x-1, y-1, oldColor, newColor);

        cd(a, x, y+1, oldColor, newColor);
        cd(a, x+1, y+1, oldColor, newColor);
        cd(a, x-1, y+1, oldColor, newColor);

        cd(a, x, y-1, oldColor, newColor);
        cd(a, x+1, y-1, oldColor, newColor);
        cd(a, x-1, y-1, oldColor, newColor);
    }



    public static void printer(int a[][]){
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }



}

