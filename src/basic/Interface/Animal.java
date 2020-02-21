package basic.Interface;
// abstract classes can only be inherited
// if the class is inherited , the child class must implements the methods within the parent class(move());
//abstract class can only contain empty methods;
public abstract class Animal {

    int age;
    String gender;

    public Animal(int age, String gender){
        this.age = age;
        this.gender = gender;
    }

    public abstract void move();

}
