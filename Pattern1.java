public class Main{

public static void main(String[] args) {
    int n = 5;
    MyPattern(n);
    MyReversePattern(n);
    MyPattern(n);
    MyReversePattern(n);
    MyPattern(n);
    MyReversePattern(n);

    System.out.println(" I AM IMPROVING ! THANK YOU ");


}

public static void MyPattern(int n) {
    int i, j, k, s = n;
    for (i = 1; i <= n; i++) {
        //space triangle
        for (k = i; k <= s; k++) {
            System.out.print("  ");
        }
        // star triangle
        for (j = i; j >= 1; j--) {
            System.out.print("* ");
        }
        //adjacent star triangle
        for (j = i - 1; j >= 1; j--) {
            System.out.print("* ");
        }
        //space triangle
        for (k = i; k <= s - 1; k++) {
            System.out.print("  ");
        }
        //adjacent space triangle
        for (k = s - 1; k >= i; k--) {
            System.out.print("  ");
        }
        //star triangle
        for (j = i; j >= 1; j--) {
            System.out.print("* ");
        }
        //adjacent star triangle
        for (j = i - 1; j >= 1; j--) {
            System.out.print("* ");
        }
        System.out.print("\n");

    }
}

public static void MyReversePattern(int n) {
    int i, j, k, s = n;
    for (i = n - 1; i >= 1; i--) {
        //space triangle
        for (k = i; k <= s; k++) {
            System.out.print("  ");
        }
        // star triangle
        for (j = i; j >= 1; j--) {
            System.out.print("* ");
        }
        //adjacent star triangle
        for (j = i - 1; j >= 1; j--) {
            System.out.print("* ");
        }
        //space triangle
        for (k = i; k <= s - 1; k++) {
            System.out.print("  ");
        }
        //adjacent space triangle
        for (k = s - 1; k >= i; k--) {
            System.out.print("  ");
        }
        //star triangle
        for (j = i; j >= 1; j--) {
            System.out.print("* ");
        }
        //adjacent star triangle
        for (j = i - 1; j >= 1; j--) {
            System.out.print("* ");
        }
        System.out.print("\n");

    }
}
}
