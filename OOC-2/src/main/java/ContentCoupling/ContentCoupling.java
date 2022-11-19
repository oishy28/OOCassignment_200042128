package ContentCoupling;

public class ContentCoupling {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.Name = "Oishy";
        employee.salary = 12000;
    }
}

// here Name and salary of Employee class is fixed by the ContentCoupling
//Class, So if we have to make another 20 classes, we have change everywhere.