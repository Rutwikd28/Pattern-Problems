import java.util.Scanner;

public class AlphabetPyramid {
    void print1(int row){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row - i -1; j++){
                System.out.print(" ");
            }
            //char
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for(int j = 1; j <= 2* i+1;j++){
                System.out.print(ch);
                if(j <= breakpoint) 
                    ch++;
                else
                    ch--;


            }
            for(int j = 0; j < row - i -1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
        
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        AlphabetPyramid pattern = new AlphabetPyramid();
        pattern.print1(rows);

    
    }
}
