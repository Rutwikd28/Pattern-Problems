import java.util.Scanner;

public class DiamondStarPatterm {
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
        System.out.println();
    }
    }
    void print2(int row){
        // 4 star pattern 
        for(int i = 0; i < row; i++){
            //Space
            for(int space1 = 0; space1 < i;space1++ ){
                System.out.print(" ");
            }
            //Stars
            for(int j = 0; j < 2*row - (2*i + 1) ; j++){
               
                System.out.print("*");
            }
            //Space
            for(int space1 = 0; space1 < i;space1++ ){
                System.out.print(" ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {

        int rows;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            rows = sc.nextInt();
        }

        DiamondStarPatterm pattern = new DiamondStarPatterm();
        pattern.print1(rows);
        pattern.print2(rows);

    
    }

}
