import java.util.*;
class q79
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row size of matrix:");
        int a=sc.nextInt();
        System.out.print("Enter column size of matrix:");
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        int i,j,rowsum=0;
        System.out.println("Enter the elements:-");
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<a;i++)
        {
            rowsum=0;
            for(j=0;j<b;j++)
            {
                rowsum=rowsum+arr[i][j];  
            }
            System.out.println("SUM OF ELEMENTS OF ROW "+(i+1)+" = "+rowsum);
        }
    }
}