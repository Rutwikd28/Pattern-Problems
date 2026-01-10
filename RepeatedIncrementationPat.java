import java.util.Scanner;

public class RepeatedIncrementationPat {
    void print2(int row){
        // 4 star pattern 
        for(int i = 1; i <= row; i++){ 
            
            for(int j = 1; j <= i ; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        RepeatedIncrementationPat pattern = new RepeatedIncrementationPat();
        pattern.print2(rows);

    
    }
}
