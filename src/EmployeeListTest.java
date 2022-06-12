public class EmployeeListTest{
    public static void main(String[] args){
        Integer employeeListSize=Input.getInteger("employee list size: ");
        EmployeeList employees=new EmployeeList(employeeListSize);
        Integer number;
        String name;
        Integer salary;
        String location;
        Integer salaryIncrease;
        Integer option;
        do{
            System.out.println("0: quit");
            System.out.println("1: add");
            System.out.println("2: increase an employee's salary");
            System.out.println("3: display from location");
            System.out.println("4: display");
            option=Input.getInteger("option: ");
            switch (option){
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1: // no error checking so assume number unique and space available to add
                    number = Input.getInteger("number: ");
                    name = Input.getString("name: ");
                    location = Input.getString("location: ");
                    salary = Input.getInteger("salary: ");
                    employees.addEmployee(number, name, location, salary);
                    break;
                case 2: // no error checking so assume number will match existing employee
                    number = Input.getInteger("number: ");
                    salaryIncrease = Input.getInteger("salary increase: ");
                    employees.increaseEmployeeSalary(number, salaryIncrease);
                    break;
                case 3:
                    location = Input.getString("location: ");
                    System.out.println(employees.getFromLocation(location));
                    break;
                case 4:
                    System.out.println(employees);
                    break;
                default:
                    System.out.println("invalid option");
            }
        }while(option!=0);
    }
}
