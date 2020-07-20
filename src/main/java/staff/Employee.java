package staff;

public abstract class Employee {
    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this. salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double value) {
        if (value > 0) {
            this.salary += (this.getSalary() * (value * 0.01));
        }
    }

    public abstract double payBonus();

    public void setName(String name) {
        if (null != name)
            this.name = name;
        else
            this.name = "Invalid Entry";
    }
}


