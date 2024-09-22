public class RightAngledTriangleStarPattern
{
    
    public static void main(String[] args) 
    {
        // Outer loop for number of rows
        for(int i = 1 ; i <=5;i++)
        {
            // Outer loop for printing Astrik '*'
            for(int j = 1;j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
        