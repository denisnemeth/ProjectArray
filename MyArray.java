package sk.itsovy.project;

import java.util.Random;

public class MyArray {

    public static void test1() {
        int[]arr=new int[7];
        for (int i=0; i<=6; i++) {
            arr[i]=i+1;
        }
        for (int i=6; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void test2() {
        Random rnd=new Random();
        int[]arr=new int[10];
        int number;
        for (int i=0; i<=9; i++) {
            number = rnd.nextInt(90)+10;
            arr[i]=number;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=9; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0; i<=9; i++) {
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
