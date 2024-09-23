import java.util.Scanner;

public class PyramidStarPattern {


    public static void pyramidPattern(int rows) 
    {
        // Outer loop for number of rows
        for(int i =1 ; i <= rows ; i++)
        {   
             //Printing spaces at the beginning of each row
            for(int j = rows;j>i;j--)
            {
                System.out.print(" ");
            }
            // Inner loop for number of stars in each row
            for(int j = 1 ; j <= i ; j++)
               {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
          
        //Taking rows value from the user
  
        System.out.println("How many rows you want in this pattern?");
  
        int rows = sc.nextInt();
  
        System.out.println("Here is your pattern....!!!"); 
        pyramidPattern(rows);
           
    }
    
}
