import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;

            int i = 1, sumLoop = 0;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System
