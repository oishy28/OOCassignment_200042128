package ControlCoupling;
//A module is said to be control coupled when
// the flow of execution is decided by a variable of another class.
public class ControlCoupling {
    public void method()
    {
        Print print = new Print();
        print.printCondition("A");
    }
}
