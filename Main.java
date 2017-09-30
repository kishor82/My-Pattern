package com.company;

public class Main {

    public static void main(String[] args) {
        int n =12;
        MyPattern(n);
        bottompart(n);
        if(n<15 && n>5) {
            System.out.print("  ");
            bottompart(n - 1);
        }
        if(n>=15) {
            System.out.print("  ");
            bottompart(n - 1);
            System.out.print("    ");
            bottompart(n - 2);
        }
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

            System.out.print("\n");

        }
    }

    public static void bottompart(int n){
        n=2*n-2;
        for (int i=1;i<=n;i++){
            if(i==1){
                System.out.print("  ");
            }
                System.out.print(" *");
        }
        System.out.println("");

    }
}


