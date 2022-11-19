package StampCoupling;
//Two classes are said to be stamp coupled if one class sends a
// collection or object as parameter and only a few data members of it is used in the second class.

public class StampCoupling {
    Person person =  new Person();
    StampCoupling2 sc2 = new StampCoupling2();

    public void personName()
    {
        sc2.personCall(person);
    }
}
//here only getName() method of a person was needed but the whole object was called