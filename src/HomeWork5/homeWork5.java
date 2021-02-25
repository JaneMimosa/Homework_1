package HomeWork5;

public class homeWork5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Rasputin Grigory", "Manager", "rararasputin@mailbox.com", "89106112516", 30000, 35);
        employeeArray[2] = new Employee("Nevski Alex", "Medic", "nea@mailbox.com", "89328745501", 35000, 41);
        employeeArray[3] = new Employee("Pupkin Vasiliy", "Cleaner", "dadaya@mailbox.com", "89005553535", 20000, 50);
        employeeArray[4] = new Employee("Pugachev Oleg", "Accountant", "OlegOleg@mailbox.com", "89602104020", 45000, 55);

        for (Employee employee : employeeArray) {
            if (employee.getAge() >= 40) {
                employee.printEmployee(employee);
            }
        }
    }
}
