package sk.itsovy.nemeth.project;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{4,5,9,-4,1,8,7,-7,1,2,10,-1,0,-5,1,6});

        System.out.println("Average: "+myArray.getAverageValue());
        System.out.println("Min: "+myArray.min());
        System.out.println("Max: "+myArray.max());
        //System.out.println("Second min: "+myArray.min2());
        //System.out.println("Second max: "+myArray.max2());
        myArray.generateValues(99,1);
        System.out.println("Contains number: "+myArray.contains(5));
        System.out.println("Count of value: "+myArray.countOfValues(1));
        System.out.println("Count of even: "+myArray.countOfEven());
        myArray.incrementValues();
    }
}
