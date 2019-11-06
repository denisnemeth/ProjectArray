package sk.itsovy.nemeth.array;

import sk.itsovy.nemeth.school.Student;
import sk.itsovy.nemeth.school.Teacher;

import java.util.Random;
import java.util.Scanner;

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

    public static void test3() {
        Random rnd=new Random();
        int[]arr=new int[12];
        int number;
        double aritAverage=0;
        int min=100, max=0;
        int secMin=100, secMax=0;
        int odd=0, even=0;
        System.out.println();
        for (int i=0; i<=11; i++) {
            number=rnd.nextInt(90)+10;
            arr[i]=number;
            System.out.print(arr[i]+" ");
            aritAverage+=arr[i];
            if (arr[i]%2!=0) {
                odd++;
            } else {
                even++;
            }
            if (arr[i]<min) {
                min=arr[i];
            }
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        for (int i=0; i<arr.length; i++) {
            if (secMin>arr[i] && min!=arr[i]) {
                secMin=arr[i];
            }
            if (secMax<arr[i] && max!=arr[i]) {
                secMax=arr[i];
            }
        }
        aritAverage/=12;
        System.out.println();
        System.out.println("aritmetic average: "+aritAverage);
        System.out.println("odd numbers: "+odd);
        System.out.println("even numbers: "+even);
        System.out.println("smallest number: "+min);
        System.out.println("second smallest number: "+secMin);
        System.out.println("largest number: "+max);
        System.out.println("second largest number: "+secMax);
    }

    public static void test4() {
        int[]arr=new int[20];
        arr[0]=0;
        System.out.print(arr[0]+" ");
        arr[1]=1;
        System.out.print(arr[1]+" ");
        for (int i=2; i<=19; i++) {
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }
    }

    /*public static void minmax(int a, int b, int c) {
        int[]result=new int[2];
        int min=3, max=0;
        for (int i=0; i<=3; i++) {

        }
        result[0]=a;
        result[1]=c;
        System.out.println(result[0]+" "+result[1]);
    }*/

    public static void test5() {
        int[]field1=new int [10];
        for (int i=0; i<=9; i++) {
            field1[i]=(int)Math.pow(2,i);
            System.out.print(field1[i]+" ");
        }
        System.out.println();
    }

    public static void test6() {
        int[]field1=new int [10];
        int[]field2=new int [10];
        field1[0]=1;
        System.out.print(field1[0]+" ");
        for (int i=1; i<=9; i++) {
            field1[i]=field1[i-1]*2;
            System.out.print(field1[i]+" ");
        }
        System.out.println();
        for (int i=0; i<=9; i++) {
            field2[9-i]=field1[i];
        }
        for (int i=0; i<=9; i++) {
            System.out.print(field2[i]+" ");
        }
        System.out.println();
    }

    public static void test7() {
        int[]a=new int[10];
        a[0]=a[1]=7;
        a[2]=13;
        a[3]=a[1]*a[2];

        int[]b={12, 38, 47, 5, 29, 16, 10, 112, 48, 65, 75, 9};

        int i, size=0;
        for (i=0; i<b.length; i++) {
            if (b[i]%3!=0) {
                size++;
            }
        }
        int[]b3n=new int[size];
        int j=0;
        for (i=0; i<b.length; i++) {
            if (b[i]%3!=0) {
                b3n[j]=b[i];
                System.out.print(b3n[j]+" ");
                j++;
            }
        }
        System.out.println();
        int[]c=new int[b.length];
        for (i=0; i<b.length; i++) {
            c[i]=b[i];
            System.out.print(c[i]+" ");
        }
        System.out.println();
        int[]d=b.clone();
        for (i=0; i<d.length; i++) {
            System.out.print(d[i]+" ");
        }
        System.out.println();
        int[]e=new int[b.length];
        System.arraycopy(b,0, e, 0, b.length);
        for (i=0; i<e.length; i++) {
            System.out.print(e[i]+" ");
        }
    }

    public static void test8() {
        Random rnd=new Random();
        int[]n=new int[20];
        int i=0, j, rndN;
        while (i<n.length) {
            int dupe=0;
            rndN=rnd.nextInt(90)+10;
            for (j=0; j<i; j++) {
                if (rndN==n[j]) {
                    dupe=1;
                    break;
                }
            }
            if (dupe==0) {
                n[i]=rndN;
                i++;
            }
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void test9() {
        Random rnd=new Random();
        Student[]arrStudent=new Student[5];
        Teacher[]arrTeacher=new Teacher[5];
        int i;
        for (i=0; i<arrStudent.length; i++) {
            int nAge=rnd.nextInt(19)+16;
            arrStudent[i]=new Student("Student"+(i+1), nAge, "1N");
        }
        for (Student temp:arrStudent) {
            if (temp.getAge()<18) {
                System.out.println(temp.getName()+" "+temp.getAge());
            }
        }
        System.out.println();
        for (i=0; i<arrTeacher.length; i++) {
            int nAge=rnd.nextInt(35)+25;
            double nSalary=rnd.nextInt(500)+500;
            arrTeacher[i]=new Teacher("Teacher"+(i+1), nAge, nSalary);
        }
        for (Teacher temp:arrTeacher) {
            if (temp.getSalary()>750) {
                System.out.println(temp.getName()+" "+temp.getSalary());
            }
        }
    }

    public static void test10() {
        String[]names={"Ivan", "Peter", "Erik", "Zuzana", "Leo", "Viliam"};
        int i, j;
        for (i=0; i<names.length; i++) {
            System.out.print(names[i]+" ");
        }
        System.out.println();
        for (i=0; i<names.length; i++) {
                if (names[i].contains("a") || names[i].contains("A")) {
                    System.out.print(names[i] + " ");
                }
        }
        System.out.println();
        int max=0, temp;
        for (i=0; i<names.length; i++) {
            for (j=0, temp=0; j<names[i].length(); j++) {
                temp++;
            }
            if (temp>max) {
                max=temp;
            }
        }
        for (i=0; i<names.length; i++) {
            for (j=0, temp=0; j<names[i].length(); j++) {
                temp++;
                if (temp==max) {
                    System.out.print(names[i]+" ");
                }
            }
        }
        System.out.println();
        /*int min=6;
        for (i=0; i<names.length; i++) {
            for (j=0, temp=6; j<names[i].length(); j++) {
                temp--;
            }
            if (temp<min) {
                min=temp;
            }
        }
        for (i=0; i<names.length; i++) {
            for (j=0, temp=0; j<names[i].length(); j++) {
                temp++;
                if (temp==min) {
                    System.out.print(names[i]+" ");
                }
            }
        }*/
        for (i=0; i<names.length; i++) {
            System.out.print(names[i].toUpperCase()+" ");
        }
        System.out.println();
        for (i=0; i<names.length; i++) {
            String name=names[i];
            for (j=0; j<name.length(); j++) {
                String z=String.valueOf(name.charAt(j));
                if ("AEIOUYaeiouy".contains(z)) {
                    System.out.print(".");
                } else {
                    System.out.print(z);
                }
            }
            System.out.print(" ");
        }
    }

    public static void test11() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Type a word: ");
        String word=sc.nextLine();
        word=word.trim();
        int i, length=word.length();
        for (i=length-1; i>=0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    public static void test12() {
        Random rnd=new Random();
        int[]x={17,0,-2,13,68,103,21,55,1};
        String[]arr={"Monika","Yelizaveta","Nikoleta","Denis","Patrik","Miro","Martin","Vlado","Laco","Jakub","Damian","Peter","Jakub","Jakub","Artyem","Tibor"};
        int[]y=new int[5];
        int i, j, n=x.length, m=arr.length;
        for (i=0; i<y.length; i++) {
            for (j=0; j<=i; j++) {
                if (y[i]==y[j]) {
                    y[i]=rnd.nextInt(79)+1;
                }
            }
            System.out.print(y[i]+" ");
        }
        System.out.println();
        for (i=0; i<n-1; i++) {
            for (j=i+1; j<n; j++) {
                if (x[i]>x[j]) {
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        for (i=0; i<m-1; i++) {
            for (j=i+1; j<m; j++) {
                if (arr[i].compareTo(arr[j])>0) {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (i=0; i<x.length; i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        for (i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (i=0; i<m-1; i++) {
            for (j=i+1; j<m; j++) {
                if (arr[i].compareTo(arr[j])<0) {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[]z={2,7,14,4,10};
        int o=z.length;
        for (i=0; i<o-1; i++) {
            for (j=0; j<o-1-i; j++) {
                if (z[j]>z[j+1]) {
                    int temp=z[j];
                    z[j]=z[j+1];
                    z[j+1]=temp;
                }
            }
            System.out.print(z[i]+" ");
        }
        System.out.print(z[4]);
    }
}
