package basic.data_types;

public class Variables {

    public static void main(String []  args) {
        // primitive variables

        byte myByte = 9 ; // (number, 1 byte)
        short myShort = 99;  // (number, 2 bytes)
        int myInt = 999;     // (number, 4 bytes)
        long myLong = 9999;   // (number, 8 bytes)
        float myFloat = 10.25f;   // (float number, 4 bytes)
        double myDouble = 10.25;   // (float number, 8 bytes)
        char myChar = 'c';     // (a character, 2 bytes)
        boolean myBolean = false;  //(true or false, 1 byte)

        // non primitive variables

        String myString = "hello";

        System.out.println(myString);
    }
}
