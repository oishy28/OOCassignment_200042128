
package DataCoupling;
//data coupling means passing more than 4 parameter in amethod from a clas.
//Data coupling is the type of coupling that occurs when necessary data is sent as parameters between methods and classes.

public class DataCoupling {
    int numberA = 1;
    int numberB = 2;
    int numberC = 3;
    boolean allNumbersSet = true;
     Adder adder= new Adder();
    public void caller() {
       adder.add(numberA, numberB, numberC, allNumbersSet);
    }
}

// here we can see that 4 parameters are being passed to caller method.
//this is not a good practice.