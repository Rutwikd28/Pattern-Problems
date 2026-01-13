import java.util.Scanner;

public class TreeStarPattern {
    void print1(int row){
        // 4 star pattern 
        for(int i = 0; i < row; i++){
            //Space
            for(int space1 = 0; space1 < row  - i -1 ;space1++ ){
                System.out.print(" ");
            }
            //Stars
            for(int j = 0; j < 2*i+1 ; j++){
               
                System.out.print("*");
            }
            //Space
            for(int space1 = 0; space1 <= row  - i - 1;space1++ ){
                System.out.print(" ");
        }
        System.out.println("\n");
    }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        TreeStarPattern pattern = new TreeStarPattern();
        pattern.print1(rows);

    
    }
}
