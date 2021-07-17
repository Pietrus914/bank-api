package com.example.Bankaccount.model;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private Long personalId;
    private BigDecimal plnValue;
    private Integer age;

    @OneToOne(targetEntity = Account.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pln_fk", referencedColumnName = "id")
    private Account account;

//    @OneToOne(targetEntity = Account.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "usd_fk", referencedColumnName = "id")
//    private Account account2;

    public UserAccount() {
    }

    public UserAccount(Long id, String name, String lastName, Long personalId, BigDecimal plnValue, Integer age, Account account) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.personalId = personalId;
        this.plnValue = plnValue;
        this.age = age;
        this.account = account;

    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Long personalId) {
        this.personalId = personalId;
    }

    public BigDecimal getPlnValue() {
        return plnValue;
    }

    public void setPlnValue(BigDecimal plnValue) {
        this.plnValue = plnValue;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof UserAccount))
            return false;
        UserAccount userAccount = (UserAccount) o;
        return Objects.equals(this.id, userAccount.id)
                && Objects.equals(this.name, userAccount.name)
                && Objects.equals(this.lastName, userAccount.lastName)
                && Objects.equals(this.personalId, userAccount.personalId)
                && Objects.equals(this.plnValue, userAccount.plnValue)
                && Objects.equals(this.age, userAccount.age)
                && Objects.equals(this.account, userAccount.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.lastName, this.personalId, this.plnValue, this.age, this.account);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", last name='" + this.lastName + '\'' +
                ", personal ID='" + this.personalId + '\'' + ", pln value=" + this.plnValue + '\'' + ", age=" + this.age + '}';
    }
}
