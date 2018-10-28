package com.srinivas;

public class Main {

    public static void main(String[] args) {
	    int counter;
	    for(counter = 1; counter <= 30; counter++) {
            System.out.println(counter +  " gallon in liters: " + counter * 3.7854);
            if (counter % 10 == 0) {
                System.out.println();
            }
        }


    }
}
