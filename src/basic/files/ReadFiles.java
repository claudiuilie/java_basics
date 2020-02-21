package basic.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) {

//
        File file = new File("src/basic/files/myFile.txt");
        Scanner input = null;

        try {
            input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        MyFileUtils myFiles = new MyFileUtils();

        //throw exception defined in method substract10..
        try {
            System.out.println(myFiles.substract10FromNumber(11));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
