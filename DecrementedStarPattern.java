import java.util.Scanner;

public class DecrementedStarPattern {
    void print1(int row){
        // 4 star pattern 
        for(int i = 1; i <= row; i++){
            System.out.println("");

            for(int j = 0; j < row -i + 1 ; j++){
                System.out.print("*");
            }
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        DecrementedStarPattern pattern = new DecrementedStarPattern();
        pattern.print1(rows);

    
    }
}
