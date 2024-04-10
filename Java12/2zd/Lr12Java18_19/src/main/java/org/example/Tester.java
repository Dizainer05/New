package org.example;

public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    char englishLevel;
    double salary;
    public Tester(String name,String surname,int expirienceInYears,char englishLevel,double salary)
    {
        this.name=name;
        this.surname=surname;
        this.expirienceInYears=expirienceInYears;
        this.englishLevel=englishLevel;
        this.salary=salary;
    }
    public Tester(String name, String surname) {
        this(name, surname, 0, 'A', 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, 'B', 0.0);
    }
    public void setter(String name)
    {
     this.name=name;
    }
    public void  setter(String name,String surname)
    {
        this.name=name;
        this.surname=surname;
    }
    public void setter(double salary)
    {
        this.salary=salary;
    }
    public static void printTesterDetails(Tester tester) {
        System.out.println("Name: " + tester.name);
        System.out.println("Surname: " + tester.surname);
        System.out.println("Experience: " + tester.expirienceInYears);
        System.out.println("English Level: " + tester.englishLevel);
        System.out.println("Salary: " + tester.salary);
    }
}
