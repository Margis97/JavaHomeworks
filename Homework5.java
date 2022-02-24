/**
* Java 1. Homework5
* @author Margarita Morozova
* @version 23.2.2022
*/
class Homework5 {
    public static void main(String[] args) {

        Employee emp = new Employee("John Smith", "Secretary", "JohnSmith@gmail.com", "+19342394", 500.5f, 21);
        System.out.println(emp + "\n");

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Sara Miller", "Manual Tester", "SaraMiller@mail.ru", "+45266523", 550f, 35);
        empArray[1] = new Employee("Margot Robby", "Engineer", "Margottt123@yahoo.com", "+32629474", 600f, 41);
        empArray[2] = new Employee("Ivan Sorokin", "Director", "Sorokin@rambler.ru", "+7777777", 1000f, 54);
        empArray[3] = new Employee("Richard Wales", "Manager", "WalesLondon@gmail.com", "+9999999", 550f, 33);
        empArray[4] = new Employee("Kim Kiano", "Developer", "145283@gmail.com", "+14528345", 700f, 29);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                System.out.println(empArray[i]);
            }
        }
    }
}

class Employee {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employee (String fullname, String position, String email, String phone, float salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return (fullname + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }

    public int getAge() {
        return age;
    }
}
