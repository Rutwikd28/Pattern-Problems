import java.util.Scanner;

public class NumberCrownPattern {
    void print2(int row){
                
        int space = 2 * (row - 1);
        for(int i = 0; i<= row ; i++){
            //numbers
            for(int j = 0; j<= i;j++){
                System.out.print(j);
            }
            //space
            for(int j = 0; j <= space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j = i; j >= 0;j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        NumberCrownPattern pattern = new NumberCrownPattern();
        pattern.print2(rows);

    
    }
}
