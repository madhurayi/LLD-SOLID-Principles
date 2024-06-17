package com.example.demo.SRP.problemeticCode;

public class Employee {

    private int id;

    public int getId(){
        return this.id;
    }

    public String fetchBioData(){
        return "Some Bio Data";
    }

    public Double calculateSalary(){
        return 0.0;
    }

    public void performanceRelatedInfo(){
        System.out.println("Some Performance Related Info");
    }
}
