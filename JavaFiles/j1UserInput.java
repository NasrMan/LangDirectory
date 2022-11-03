package JavaFiles;
import java.util.Scanner;

class Nasr{

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Please enter your name");
        Scanner myAge = new Scanner(System.in);

        String userName= myObj.nextLine();

        System.out.println("Please enter your age");
        int uAge = myAge.nextInt();

        System.out.println("your name is " +userName + " and your age is  "+ uAge);

        Scanner sc = new Scanner(System.in);
        Scanner age =new Scanner(System.in);

        System.out.println("Please enter her name: ");

        String herName= sc.nextLine();

        System.out.println(herName);

        System.out.println("Please enter her age");
        int herAge =age.nextInt();
         System.out.println("her name is " +herName + " and her age is  "+ herAge);

        Scanner Ask = new Scanner(System.in);
        Scanner Ans = new Scanner(System.in);

        System.out.println("Please ente your Counter");
        String as= Ask.nextLine();
        System.out.println("Please ente your City");
        String an= Ask.nextLine();
        System.out.println("your country is " +as + " and your city is  "+ an);
    }
}