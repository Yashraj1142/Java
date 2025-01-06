//Program to implement static variable.

class Employees{
    static float salary = 10000.0f;
    String EmpName;
    int Empid;

    Employees(String EmpName, int Empid){
        this.EmpName = EmpName;
        this.Empid = Empid;
    }

    void printDetails(){
        System.err.println(EmpName + " : " + Empid + " has salary " + salary);
    }

    //changing the salary
    static float getSalary(){
        return salary;
    }

    static void setSalary(float salary){
        Employees.salary = salary;
    }
}

class staticVariable{
    public static void main(String[] args) {
        Employees e1 = new Employees("Rohan", 1);
        Employees e2 = new Employees("Saumya", 2);

        e1.printDetails();
        e2.printDetails();

        Employees.setSalary(20000.0f);
        Employees e3 = new Employees("Armaan", 3);
        e3.printDetails();
    }
}