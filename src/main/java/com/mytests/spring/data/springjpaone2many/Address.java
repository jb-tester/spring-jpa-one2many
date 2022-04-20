package com.mytests.spring.data.springjpaone2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * *
 * <p>Created by irina on 12/14/2021.</p>
 * <p>Project: spring-jpa-one2many</p>
 * *
 */
@Entity
@Table(name = "addresses", schema = "reltest")
public class Address {
    @Id
    @Column(name = "address_id")
    private long id;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "person_id")
    private long personId;
    private String city;
    private String building;

    public Address() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", building='" + building + '\'' +
                '}';
    }

    public Address(long id, String city, String streetName, String building, String zipCode, long personId  ) {
        this.id = id;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.personId = personId;
        this.city = city;
        this.building = building;
    }
}
