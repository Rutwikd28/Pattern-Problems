import java.util.Scanner;

public class HalfDiamondStarPattern {
    void print1(int row){
        // star pattern 
        for(int i = 0; i <= 2 * row - 1; i++){   
            int stars = i;
            if(i > row) stars = 2*row-i;
            //Stars
            for(int j = 0; j < stars ;j++ ){
                System.out.print("*");
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

        HalfDiamondStarPattern pattern = new HalfDiamondStarPattern();
        pattern.print1(rows);

    
    }

}
