package org.wrapperclass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Autoboxing: Converting primitive types to their corresponding wrapper class objects
        int primitiveInt = 10;
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Explicit boxing
        Integer autoBoxedInt = primitiveInt; // Autoboxing
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);

        //Unboxing: Converting wrapper class objects back to their corresponding primitive types
        Integer anotherWrappedInt = Integer.valueOf(20);
        int unboxedInt = anotherWrappedInt.intValue(); // Explicit unboxing
        int autoUnboxedInt = anotherWrappedInt; // Autounboxing
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Auto-unboxed Integer: " + autoUnboxedInt);

    }
}