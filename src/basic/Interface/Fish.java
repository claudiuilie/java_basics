package basic.Interface;

public class Fish extends Animal {
    public Fish(int age, String gender) {
        super(age, gender);
    }

    @Override
    public void move() {
        System.out.println("Swimming...");
    }

}
