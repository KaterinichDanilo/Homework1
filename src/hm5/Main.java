package hm5;

public class Main {
    public static void main(String[] args) {
        Employee [] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Ivanov Ivan1", "Engineer1", "ivivan@mailbox.com1", "892312312 1", 10000, 30);
        employeesArray[2] = new Employee("Ivanov Ivan2", "Engineer2", "ivivan@mailbox.com2", "892312312 2", 20000, 50);
        employeesArray[3] = new Employee("Ivanov Ivan3", "Engineer3", "ivivan@mailbox.com3", "892312312 3", 30000, 30);
        employeesArray[4] = new Employee("Ivanov Ivan4", "Engineer4", "ivivan@mailbox.com4", "892312312 4", 40000, 60);

        for (Employee employee : employeesArray) {
            if (employee.getAge() > 40) {
                employee.showInfo();
            }
        }
    }
}
