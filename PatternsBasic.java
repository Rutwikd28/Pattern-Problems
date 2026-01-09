import java.util.Scanner;

public class PatternsBasic {
    void print1(int row){
        // 4 star pattern 
        for(int i = 0; i < row; i++){
            System.out.println("");

            for(int j = 0; j < 4 ; j++){
                System.out.print("*");
            }
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        PatternsBasic pattern = new PatternsBasic();
        pattern.print1(rows);

    
    }
}
