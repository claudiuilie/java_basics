package basic.Interface;

public class Zoo {
    public static void main(String [] args){
        // sparrow1 implents all the methods inside Sparrow class + methods from parents
        Sparrow sparrow1 = new Sparrow(10,"male");

        //fish1 implements only the methods within Anilam class, methods within Fish class are not available;
        Animal fish1 =  new Fish(10,"femal");
        String tes = "Data";

        moveAnimal(fish1);
        moveAnimal(sparrow1);


    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}

