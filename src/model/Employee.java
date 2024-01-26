package model;

import java.util.Date;

public class Employee
{
    private final int employeeID;
    private final String firstName;

    private final String lastName;

    private final Profession profession;
    private final Integer departmentID;
    private final Float salary;
    private final Date hiredDate;

    private Employee(EmployeeBuilder builder)
    {
        this.employeeID = builder.employeeID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.profession = builder.profession;
        this.departmentID = builder.departmentID;
        this.salary = builder.salary;
        this.hiredDate = builder.hiredDate;
    }
    public static class EmployeeBuilder {
        private final Integer employeeID;
        private final String firstName;
        private final String lastName;

        privtae final Profession profession;
        private Integer departmentID;
        private Float salary;
        private Date hiredDate;

        public EmployeeBuilder()
        {

        }
    }
}

enum Profession {
    ACCOUNTANT,
    SOFTWARE_DEVELOPER,
    SOFTWARE_ENGINEER,
    HUMAN_RESOURCES_MANAGER,
    HUMAN_RESOURCES_SPECIALIST,
    SALES_REPRESENTATIVE;
}

enum Department {
    SOFTWARE_DEVELOPMENT,
    MARKETING,
    FINANCE
}