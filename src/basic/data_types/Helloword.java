package basic.data_types;

public class Helloword {
    static void mainVoid(String text){
        System.out.println(text);

    }

    public static void main (String []  args) {
        mainVoid("some text");
    }
}

/*
#main
 This is the name of java main method.
 It’s fixed and when we start a java program, it looks for the main method.
 Its syntax is always public static void main(String[] args)

#String[] args
Java main method accepts a single argument of type String array.
This is also called as java command line arguments

# public
This is the access modifier of the main method.
It has to be public so that java runtime can execute this method.
Remember that if you make any method non-public then it’s not allowed to be executed by any program, there are some access restrictions applied.
So it means that the main method has to be public.

#static
When java runtime starts, there is no object of the class present.
That’s why the main method has to be static so that JVM can load the class into memory and call the main method.
If the main method won’t be static, JVM would not be able to call it because there is no object of the class is present.

#void
Java programming mandates that every method provide the return type.
Java main method doesn’t return anything, that’s why it’s return type is void.
This has been done to keep things simple because once the main method is finished executing, java program terminates.
So there is no point in returning anything, there is nothing that can be done for the returned object by JVM.
If we try to return something from the main method, it will give compilation error as an unexpected return value.
 */