import java.util.Scanner;

public class HollowDiamondStarPat {
    void print1(int row){
        int inis = 0;
        for(int i = 0; i < row; i++){
            
            //Stars
            for(int j = 1; j <= row-i;j++){
                System.out.print("*");
            }
            //Spaces
            for(int j = 0;j < inis;j++){
                System.out.print(" ");
            }

            //Stars
             for(int j = 1; j <= row-i;j++){
                System.out.print("*");
            }
            inis += 2;
            System.out.println();
        }
        inis = 2* row - 2;
        for(int i = 1; i<=row; i++){
             //Stars
            for(int j = 1; j <= i;j++){
                System.out.print("*");
            }
            //Spaces
            for(int j = 0;j < inis;j++){
                System.out.print(" ");
            }

            //Stars
             for(int j = 1; j <= i;j++){
                System.out.print("*");
            }
            inis -= 2;
            System.out.println();
        }
        
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        HollowDiamondStarPat pattern = new HollowDiamondStarPat();
        pattern.print1(rows);

    
    }
}
