package com.company;


public class Main {

    public static void main(String[] args) {
	// Employee's section
        Employee emp1= new Employee();
        emp1.Name="Yash";
        emp1.age=21;
        emp1.PhoneNumber="9082881207";
        emp1.Address="201-Tirupati Balaji,Sector-21,Kamothe-410209";
        emp1.Salary=20000;
        emp1.specialization="Java";


        System.out.println("The name of the employee is:"+emp1.Name);
        System.out.println("Employee's age is:"+emp1.age);
        System.out.println("Employee's phone number is:"+emp1.PhoneNumber);
        System.out.println("Employee's address is:"+emp1.Address);
        System.out.println("Employee's specialization is:"+emp1.specialization);
        emp1.printSalary();

//Manager's section
        Manager m1 = new Manager();
        m1.Name="Arjun";
        m1.age=31;
        m1.PhoneNumber="123456789";
        m1.Address="111-Pratham heights,Sector-17,Kamothe-410209";
        m1.Salary=60000;
        m1.Department="Engineering";

        System.out.println("The name of Manager is "+m1.Name);
        System.out.println("Manager's age is:"+m1.age);
        System.out.println("Manager's phone number is:"+m1.PhoneNumber);
        System.out.println("Manager's address is:"+m1.Address);
        System.out.println("Manager's Department is:"+m1.Department);

    }
}
