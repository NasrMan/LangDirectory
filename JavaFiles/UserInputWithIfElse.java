package JavaFiles;
import java.util.Scanner;

class UserWithIf{

    public static void main(String[] args) {
        Scanner name= new Scanner(System.in);
        Scanner Age = new Scanner(System.in);

        System.out.println("Please enter your name");
        String n = name.nextLine();

        System.out.println("Please enter your Age");
        int Ag = Age.nextInt();

        if (n== "Nasr" && Ag == 45) {
            
            System.out.println("Please proceed");
        }
        else {

            System.out.println("Sorry");
        }

    }
}