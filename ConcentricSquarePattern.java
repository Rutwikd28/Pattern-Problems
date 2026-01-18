import java.util.Scanner;

public class ConcentricSquarePattern {
    void print1(int row){
       for(int i = 0; i<2*row-1; i++)   {
        for(int j = 0 ; j<2*row-1;j++)  {
            int top =  i;
            int left = j;
            int right = (2*row - 2) - j;
            int down = (2*row - 2) - i;
            System.out.print(row - Math.min(Math.min(top, down), Math.min(left, right)) + " ");
            
            }
            System.out.println();

       }
    
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        ConcentricSquarePattern pattern = new ConcentricSquarePattern();
        pattern.print1(rows);

    
    }
}
