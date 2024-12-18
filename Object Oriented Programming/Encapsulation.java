class Employee{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Encapsulation{
    public static void main(String args[]){
        Employee e1 = new Employee();

        e1.setName("ABC");
        e1.setAge(20);

        System.out.println("Name of the employee: " + e1.getName());
System.out.println("Name of the Age: " + e1.getAge());
    }
}