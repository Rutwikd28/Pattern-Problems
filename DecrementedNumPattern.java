import java.util.Scanner;

public class DecrementedNumPattern {
    void print1(int row){
        // 4 star pattern 
        for(int i = 0; i <= row; i++){
            System.out.println("");

            for(int j = 1; j < row - i + 1 ; j++){
                System.out.print(j);
            }
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        DecrementedNumPattern pattern = new DecrementedNumPattern();
        pattern.print1(rows);

    
    }
}
