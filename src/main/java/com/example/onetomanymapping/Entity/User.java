package com.example.onetomanymapping.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Name")
    private String name;
    @Column(name="Email")
    private String email;
    @Column(name="DOB")
    private LocalDate dateofbirth;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="pc_id" , referencedColumnName = "id")
    public List<UserProfile> userProfile;

    public List<UserProfile> getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(List<UserProfile> userProfile) {
        this.userProfile = userProfile;
    }
    public User(List<UserProfile> userProfile) {
        this.userProfile = userProfile;
    }



    public User()
    {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }


    public User(long id, String name, String email, LocalDate dateofbirth,UserProfile userProfile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateofbirth = dateofbirth;

    }


}
