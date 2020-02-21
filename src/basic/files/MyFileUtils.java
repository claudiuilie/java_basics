package basic.files;

public class MyFileUtils {

    public int substract10FromNumber(int number) throws Exception {

        if(number < 10){
            throw new Exception("Number is smaller than 10.");
        }

        return number -10;
    }

}
