package hm5;

public class Employee {
    private String fullName;
    private String position;
    private String phoneNumber;
    private String email;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String phoneNumber, String email, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo(){
        System.out.printf("%s %s %s %s %d %d\n", fullName, position, phoneNumber, email, salary, age);
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
