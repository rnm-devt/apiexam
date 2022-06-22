package com.example.connecttest.person;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(generator="person_seq")
    @SequenceGenerator(name="person_seq", sequenceName="person_id_seq", allocationSize=1)
    private Integer id;

    @Column(name="fullname")
    @NotBlank
    private String fullName;

    @Column(name="email")
    @NotBlank
    private String emailAddress;

    @Column(name="mobile")
    @NotBlank
    private String mobileNumber;

    @Column(name="dob")
    private Date dateOfBirth;

    @Column(name="age")
    private int age;

    @Column(name="gender")
    @NotBlank
    private String gender;

    public Person(){}
    public Person(
            String fullName,
            String emailAddress,
            String mobileNumber,
            Date dateOfBirth,
            int age,
            String gender
    ){
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth.toString();
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
