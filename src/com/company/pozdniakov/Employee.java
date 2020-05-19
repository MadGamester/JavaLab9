package com.company.pozdniakov;

public class Employee {
    protected int id;
    protected static int nextId;
    protected String name;
    protected double salary;
    protected Manager manager;

    public Employee(String name,double salary) throws FieldLengthLimitException,IncorrectSalaryException{
        this.nextId++;
        this.id = this.nextId;
        if(name.length() > 20) {
            throw new FieldLengthLimitException("Too long surname. (Less than 20 symbols needed)");
        }
        if(salary < 0){
            throw new IncorrectSalaryException("Salary can't be less then zero");
        }
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws FieldLengthLimitException{
        this.name = name;
        if (name.length() > 20) {
            throw new FieldLengthLimitException("Too long surname. (Less than 20 symbols needed)");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IncorrectSalaryException{
        if(salary < 0){
            throw new IncorrectSalaryException("Salary can't be less then zero)");
        }
        this.salary = salary;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public final void raiseSalary(double p){
        this.salary = this.salary*(100+p)/100;
    }
    public String toString(){
        return "Employee " + this.name + "( id - " + this.id + " )" + " have sal = " + this.salary;
    }

    public void getManagerName(){
        if(manager == null) {
            System.out.println("No Manager (");
        }else {
            System.out.println(this.getManager().getName());
        }
    }

    public Employee getTopManager(Manager manager){
        if(manager == null) {
            return this;
        }else {
            return manager.getTopManager(manager.getManager());
        }
    }

//    public Employee getTopManager(){
//        if(manager == null) {
//            return this;
//        }else {
//            return this.getTopManager();
//        }
//    }
}

