import java.util.Scanner;

public class LeftAngledTrianglePattern 
{
      public static void leftAngledTrianglePattern(int rows) 
    {
        for(int i =1 ; i <= rows ; i++)
        {
           for(int j = 2*(rows-i);j>i;j--)
           {
            System.out.print(" ");
           }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
          
        //Taking rows value from the user
  
        System.out.println("How many rows you want in this pattern?");
  
        int rows = sc.nextInt();
  
        System.out.println("Here is your pattern....!!!"); 
        leftAngledTrianglePattern(rows);
           
    }
    
}
    
}
