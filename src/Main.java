import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= n - i + 1; j++) {
//         System.out.print(j + " ");
//         }
//         System.out.println("");
//         }
//
//         // Pyramid Start
//         for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//         }
//         for (int k = 1; k <= 2 * i - 1; k++) {
//         System.out.print("*");
//         }
//         for (int l = 1; l <= n - i; l++) {
//         System.out.print(" ");
//         }
//         System.out.println();
//         }
         // Pyramid End

         // Reverse Pyramid Start

         for (int i = 0; i < n; i++) {
         for (int j = 0; j <= i; j++) {
         System.out.print(" ");
         }

         for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
         System.out.print("*");
         }

         for (int l = 0; l <= i; l++) {
         System.out.print(" ");
         }
         System.out.println();
         }
         // Reverse Pyramid End

         //Combined Pyramid Start

         //Pyramid Start
//         for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//         }
//         for (int k = 1; k <= 2 * i - 1; k++) {
//         System.out.print("*");
//         }
//         for (int l = 1; l <= n - i; l++) {
//         System.out.print(" ");
//         }
//         System.out.println();
//         }
         //Pyramid End

         //Reverse Pyramid Start

//         for (int i = 0; i < n; i++) {
//         for (int j = 0; j < i; j++) {
//         System.out.print(" ");
//         }
//
//         for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
//         System.out.print("*");
//         }
//
//         for (int l = 0; l < i; l++) {
//         System.out.print(" ");
//         }
//         System.out.println();
//         }
         //Reverse Pyramid End

         //Combined Pyramid End






    }
}