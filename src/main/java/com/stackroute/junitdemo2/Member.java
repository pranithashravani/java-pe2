package com.stackroute.junitdemo2;

public class Member {
    private String name;

    private int age;
     private double salary;
    public String getName() {
        return name;
    }

     public int getAge()
     {
         return age;
     }
     public double getSalary()
     {
         return salary;
     }
    public void setName(String newName) {
        this.name = newName;
    }


    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }
}




