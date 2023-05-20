// Abdelrahman mostafa
// 20216362
public class Employee {
    package BankSystem;
    class employee extends human {
        private double salary;
        private String department;
        employee(String Name, int Age, String Gender, double salary, String department){
            super(Name, Age, Gender);
            this.salary = salary;
            this.department = department;
        }
        void PrintData(){
            super.PrintData();
            System.out.println("Salary: " + salary + ", Department: " + department);
        }
        double getSalary(){
            return salary;
        }
        String getDepartment(){
            return department;
        }
}