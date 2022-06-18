package com.example.onetomanymapping.Entity;

import javax.persistence.*;

@Entity
@Table(name="UP")
public class UserProfile
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name="Gender")
    private String gender;
    @Column(name="Address")
    private String address;
    @Column(name="Contact")
    private String contact;

    public UserProfile()
    {

    }


    public UserProfile(String id, String gender, String address, String contact) {
        this.id = id;
        this.gender = gender;
        this.address = address;
        this.contact = contact;

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }





}
