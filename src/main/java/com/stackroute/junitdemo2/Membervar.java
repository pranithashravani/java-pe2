package com.stackroute.junitdemo2;

public class Membervar {


        public static void main(String[] args) {
            Member m = new Member();
            m.setName("Harry Potter");
            m.setAge(30);
            m.setSalary(2500.3);
            System.out.println(m.getName());
            System.out.println(m.getAge());
            System.out.println(m.getSalary());
        }
    }

