package JavaFiles;

import java.util.Scanner;

public class nestedLoops {

    public static void main(String[] args) {
        

        Scanner scanner= new Scanner(System.in);

        int rows;  int cols; String Symbol="";

        System.out.println("Please enter # of rows");
        rows= scanner.nextInt();
        System.out.println("Please enter # of cols");
        cols= scanner.nextInt();
        System.out.println("Please enter # of symbol");
        Symbol=scanner.next();

        for (int i = 0; i <=rows; i++) {
            System.out.println();
            for (int j = 1; j < cols; j++) {
                // use print below not println()
                System.out.print(Symbol);
            }
        }

    }
}
