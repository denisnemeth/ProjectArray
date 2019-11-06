package sk.itsovy.nemeth.project;

import java.util.Arrays;
import java.util.Random;

public class MyArray implements ArrayMethods {
    private int[] arr;
    private int size;

    public MyArray(int size) {
        if (size>=0) error("Invalid array size!");
        this.size=size;
        arr=new int[size];
        resetArrayToZero();
    }

    public MyArray(int[] input) {
        if (input==null) error("Empty array!");
        this.arr=input;
        this.size=input.length;
    }

    public int getSize() {
        return size;
    }

    private void resetArrayToZero() {
        for (int i=0; i<size; i++) arr[i]=0;
    }

    @Override
    public double getAverageValue() {
        int sum=0;
        for (int i=0; i<arr.length; i++) sum=sum+arr[i];
        double average=(double) sum/arr.length;
        return average;
    }

    @Override
    public int min() {
        int min=arr[0];
        for (int i=0; i<arr.length; i++) if (arr[i]<min) min=arr[i];
        return min;
    }

    @Override
    public int max() {
        int max=arr[0];
        for (int i=0; i<arr.length; i++) if (arr[i]>max) max=arr[i];
        return max;
    }

    @Override
    public int min2() {
        error("Method 'min2' is not supported!");
        return 0;
    }

    @Override
    public int max2() {
        error("Method 'max2' is not supported!");
        return 0;
    }

    private void error(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println("The application will be terminated!");
        System.exit(1);
    }

    @Override
    public void generateValues(int a, int b) {
        Random rnd=new Random();
        int value=rnd.nextInt(a)+b;
        System.out.println("Generated: "+value);
    }

    @Override
    public boolean contains(int value) {
        boolean contains=false;
        for (int i=0; i<arr.length; i++) if (arr[i] == value) contains=true;
        return contains;
    }

    @Override
    public int countOfValues(int value) {
        int count=0;
        for (int i=0; i<arr.length; i++) if (arr[i]==value) count++;
        return count;
    }

    @Override
    public int countOfEven() {
        int count=0;
        for (int i=0; i<arr.length; i++) if (arr[i]%2==0 && arr[i]!=0) count++;
        return count;
    }

    @Override
    public void incrementValues() {
        for (int i=0; i<arr.length; i++) {
            arr[i]++;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void sort(boolean asc) {
        int temp, i, j;
        if (asc=true) {
            for (i=0; i<arr.length-1; i++) {
                for (j=0; j<arr.length-1-i; j++) {
                    if (arr[j]>arr[j+1]) {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        } /*else {
            for (i=0; i<arr.length-1; i++) {
                for (j=0; j<arr.length-1-i; j++) {
                    if (arr[j]>arr[j+1]) {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }*/
        for (i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
    }

    @Override
    public void addItem(int newValue) {
    }

    @Override
    public void addItem(int newValue, int position) {
    }

    @Override
    public int[] copy() {
        return new int[0];
    }

    @Override
    public int getItem(int position) {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
