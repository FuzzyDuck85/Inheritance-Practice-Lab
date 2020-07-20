package staff.techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee {

    public DatabaseAdmin(String name, String NINumber, double salary){
        super(name, NINumber, salary);
    }

    public double payBonus(){
        return (super.getSalary()/100);
    }

}
