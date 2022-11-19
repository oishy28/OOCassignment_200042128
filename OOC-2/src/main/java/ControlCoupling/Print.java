package ControlCoupling;

public class Print {
    public void printCondition(String string)
    {
        if(string == "A")
        {
            System.out.println("Printing A");
        }
        else {
            System.out.println("Not Printing Anything");
        }
    }
}
//here printCondition() function is being controlled by the ControlCoupling Class.