import java.util.Scanner;

public class ButterflyPattern {
    void print1(int row){
        int spaces = 2*row -2;
        for(int i = 1; i <= 2*row-1; i++){
            
            int stars = i;
            if(i > row) stars = 2*row-i;

            //Stars
            for(int j = 1; j<= stars;j++){
                System.out.print("*");
            }
            //Spaces
            for(int j = 1;j <= spaces;j++){
                System.out.print(" ");
            }

            //Stars
            for(int j = 1; j<= stars;j++){
                System.out.print("*");
            }
            
            System.out.println();
            if(i < row) spaces -= 2;
            else spaces += 2;
        }
        
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        ButterflyPattern pattern = new ButterflyPattern();
        pattern.print1(rows);

    
    }
}
