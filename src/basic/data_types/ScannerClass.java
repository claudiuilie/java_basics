package basic.data_types;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String [] args){
        System.out.println("Enter text");

        Scanner input = new Scanner(System.in);
        String myLine = input.nextLine();

        System.out.println(myLine);
    }
}
