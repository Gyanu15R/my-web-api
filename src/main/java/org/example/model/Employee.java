package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long  empId;
    @Column(name = "empName")
    String empName;
    @Column(name = "dept")
    String dept;
    @Column(name = "email")
    String email;


    public Employee(String empName, int empId, String dept, String email) {
        this.empName = empName;
        this.empId = empId;
        this.dept = dept;
        this.email = email;
    }

    public Employee() {

    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpId() {
        return  empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
