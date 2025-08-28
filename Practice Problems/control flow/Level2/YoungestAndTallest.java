import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar's height: ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = sc.nextDouble();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        System.out.println("The youngest age is: " + youngestAge);

        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        System.out.println("The tallest height is: " + tallestHeight);

        sc.close();
    }
}
