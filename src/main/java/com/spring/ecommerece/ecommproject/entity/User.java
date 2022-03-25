package com.spring.ecommerece.ecommproject.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public  class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Email
    @Column(name = "email", unique = true)
    private String email;

    @NotNull
    @Size(max = 30)
    @Column(name = "first_name")
    private String firstName;

    @Size(max = 30)
    @Column(name = "middle_name")
    private String middleName;

    @Size(max = 30)
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    @Size(min = 8 , max = 16)
    private String password;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "is_expired")
    private boolean isExpired;

    @Column(name = "is_locked")
    private boolean isLocked;

    @Column(name = "invalid_attemp_count")
    private int invalidAttemptCount = 0;

    @Column(name = "password_Update_date")
    private Date passwordUpdateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getInvalidAttemptCount() {
        return invalidAttemptCount;
    }

    public void setInvalidAttemptCount(int invalidAttemptCount) {
        this.invalidAttemptCount = invalidAttemptCount;
    }

    public Date getPasswordUpdateDate() {
        return passwordUpdateDate;
    }

    public void setPasswordUpdateDate(Date passwordUpdateDate) {
        this.passwordUpdateDate = passwordUpdateDate;
    }
}

