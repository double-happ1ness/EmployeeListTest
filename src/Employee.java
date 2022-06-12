public class Employee{
    private Integer number;
    private String name;
    private String location;
    private Integer salary;

    public Employee(Integer number, String name, String location, Integer salary){
        this.number=number;
        this.name=name;
        this.location=location;
        this.salary=salary;
    }

    public Boolean worksInLocation(String location){
        return this.location.equals(location);
    }

    public void increaseSalary(Integer salaryIncrease){
        this.salary+=salaryIncrease;
    }

    public String toString(){
        return "number: "+this.number+" name: "+this.name+"  location: "+this.location+"  salary: "+this.salary;
    }

    public Integer getNumber(){
        return this.number;
    }
}
