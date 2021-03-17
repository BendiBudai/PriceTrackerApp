package com.bb.testPTApp.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
@Table
public class Product {

    @Id
    @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1 // increment 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private Long ID;
    private String name;
    private double price;

    // @Size(min=3, message="enter min 3") // add regex to valid link
    private String link;

    private LocalDateTime lastCheck;

    public Product() {

    }

    public Product(Long ID, String name, double price, String link, LocalDateTime lastCheck) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.link = link;
        this.lastCheck = lastCheck;
    }

    public Product(String name, double price, String link, LocalDateTime lastCheck) {
        this.name = name;
        this.price = price;
        this.link = link;
        this.lastCheck = lastCheck;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDateTime getLastCheck() {
        return lastCheck;
    }

    public void setLastCheck(LocalDateTime lastCheck) {
        this.lastCheck = lastCheck;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + ID + ", name='" + name + '\'' + ", price=" + price + ", link='" + link + '\''
                + ", lastCheck=" + lastCheck + '}';
    }
}
