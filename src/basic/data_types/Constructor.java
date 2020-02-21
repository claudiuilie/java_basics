package basic.data_types;

public class Constructor {
    public static void main(String [] args){
        Student student1 = new Student(); // (default constructor)
        Student student2 = new Student("John", 10);
        System.out.println(student2.name + student2.group);
    }
}

class Student {
    String name;
    int group;

    //default constructor , must have the same name like the class
    //the code inside will be executed when the object is created => new basic.data_types.Student();
    Student() {
        System.out.println("Object has been created");
    }

    // the constructor can use parameters to set data when created.
    Student(String name , int group){
        this.name = name;
        this.group = group;
    }
}