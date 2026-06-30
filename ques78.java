import java.util.*;
class q78
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row size of matrix:");
        int a=sc.nextInt();
        System.out.print("Enter column size of matrix:");
        int b=sc.nextInt();
        if(a!=b)
        {
            System.out.println("ROW AND COLUMN SIZE SHOULD BE EQUAL.");
            System.exit(0);
        }
        int arr[][]=new int[a][a];
        int trans[][]=new int[a][a];
        int i,j,c=0;
        System.out.println("Enter the elements:-");
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                trans[j][i]=arr[i][j];
            }
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                if(arr[i][j]==trans[i][j]) c++;
            }
        }
        if(c==a*a) System.out.println("MATRIX IS SYMMETRICAL.");
        else System.out.println("MATRIX IS NOT SYMMETRICAL.");
    }
}