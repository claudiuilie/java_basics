package basic.data_types;

public class Loops {
    public static void main(String [] args){

        //while
        boolean whyleLoop = false;
        while (whyleLoop == false) {
            System.out.println(whyleLoop);
            whyleLoop = true;
        }

        // do While
        int doWhileLoop = 1;
        do {
            System.out.println(doWhileLoop);
            doWhileLoop++;
        }
        while (doWhileLoop < 3);

        //for
        for(int i =0; i<3; i++){
            System.out.println(i);
        }
    }
}
