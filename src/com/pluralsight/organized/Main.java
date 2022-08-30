package com.pluralsight.organized;

public class Main {

    public static void main(String[] args) {
        System.out.println("We got organized!");

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC; //19

        int result2 = (valA - valB) / valC; //5

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;

        int result4 = valA/ (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result5 = (short) longVal;
        short result6 = (short) (byteVal - longVal);
        float result7 = longVal - floatVal;

        System.out.println("Success");


    }
}

