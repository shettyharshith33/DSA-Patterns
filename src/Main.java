import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        // Call each pattern function
        System.out.println("\nPattern 1: Decreasing Numbers");
        printPyramid(n);


    }

    public static void printDecreasingNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 2. Pyramid
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Reverse Pyramid
    public static void printReversePyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4. Diamond (Combined Pyramid + Reverse Pyramid)
    public static void printDiamond(int n) {
        // Top pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom reverse pyramid
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i - 1) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Sandglass Pattern
    public static void printSandglass(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Binary Triangle (Alternating 1 & 0)
    public static void printBinaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int start = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
                
            }
            System.out.println();
        }
    }
}
