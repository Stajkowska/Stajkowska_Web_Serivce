package com.stajkowska.rest.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private int age;
    @Column
    private String department;

    public long getId() {
        return id;
    }
    public void setId(long _id){
        this.id = _id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String _firstName){
        this.firstName = _firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String _lastName){
        this.lastName = _lastName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int _age){
        this.age = _age;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String _department){
        this.department = _department;
    }

    public User(String firstName, String lastName, int age, String department) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
    }
}
