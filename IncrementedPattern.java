import java.util.Scanner;

public class IncrementedPattern {
    void print2(int row){
        // 4 star pattern 
        for(int i = 0; i < row; i++){ 

            for(int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        IncrementedPattern pattern = new IncrementedPattern();
        pattern.print2(rows);

    
    }
}
