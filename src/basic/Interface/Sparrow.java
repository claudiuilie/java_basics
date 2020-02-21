package basic.Interface;
// a class only extends 1 class (can only have 1 parent)
//but can have how many interfaces he want
public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender) {
        super(age, gender);
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
