package com.globomatics.bike.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"Handler", "hibernateLazyInitializer"})
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String model;
    private String serial_Number;
    private BigDecimal purchase_Price;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-DD-YY")
    private Date purchase_Date;
    private Boolean contact;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serial_Number;
    }

    public void setSerialNumber(String serialNumber) {
        this.serial_Number = serialNumber;
    }

    public BigDecimal getPurchasePrice() {
        return purchase_Price;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchase_Price = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchase_Date;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchase_Date = purchaseDate;
    }

    public Boolean getContact() {
        return contact;
    }

    public void setContact(Boolean contact) {
        this.contact = contact;
    }

}
