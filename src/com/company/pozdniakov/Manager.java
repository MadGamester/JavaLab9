package com.company.pozdniakov;

public class Manager extends Employee {
    double bonus;

    public Manager(String name, double salary,double bonus) throws FieldLengthLimitException,IncorrectSalaryException {
        super(name,salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        return this.salary + this.bonus;
    }

    public String toString(){
        return "Employee " + this.name + "( id - " + this.id + " )" + " have sal = " + this.salary + " and bonus = " + this.bonus;
    }
}

