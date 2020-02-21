package basic.Interface;
//inheritance (extends)
// a class only extends 1 class (can only have 1 parent)
public class Bird extends Animal {

    public Bird(int age, String gender) {
        super(age, gender);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }

}
