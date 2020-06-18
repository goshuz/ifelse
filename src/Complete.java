import java.util.Scanner;

public class Complete {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.println("Please enter a number ");
        num=scanner.nextInt();

        if (num > 10) {
            System.out.println("Number is greater than 10.");
        }
        else if(num<10) {
            System.out.println("Number is less than 10.");
        }
else
        System.out.println("Number is equal to 10.");
    }
}