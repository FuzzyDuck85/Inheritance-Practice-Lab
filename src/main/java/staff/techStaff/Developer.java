package staff.techStaff;

import staff.Employee;

public class Developer extends Employee {

    public Developer(String name, String NINumber, double salary){
        super(name, NINumber, salary);
    }

    public double payBonus(){
        return (super.getSalary()/100);
    }
}
