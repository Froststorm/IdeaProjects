import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input  number of rows");
        int n = sc.nextInt();
//        String a = "";
        for (int i = 0; i <= n; i++)
        {
            for (int j=0;j<=i;j++)
            {

                int iCounter = j;
                if (iCounter < n/2)
                {
                     System.out.print("*");
                }
                else
                {
                    j = n - iCounter;
                    System.out.print("*");
                }
            }
        }
    }
}
