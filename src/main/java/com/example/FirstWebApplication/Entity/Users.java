package com.example.FirstWebApplication.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name") // Переконайтесь, що ім'я стовпця правильне
    private String firstname;
    @Column(name = "last_name") // Переконайтесь, що ім'я стовпця правильне
    private String lastname;
    @Column(name = "email") // Переконайтесь, що ім'я стовпця правильне
    private String email;
    @Column(name = "bio") // Переконайтесь, що ім'я стовпця правильне
    private String bio;
    @Column(name = "role") // Переконайтесь, що ім'я стовпця правильне
    private String role;

    @Column(name = "password") // Переконайтесь, що ім'я стовпця правильне
    private String password;

    @Column(name = "avatar") // Переконайтесь, що ім'я стовпця правильне
    private String avatar;
    @Column(name = "created_at") // Переконайтесь, що ім'я стовпця правильне
    private Date created_at;
    @Column(name = "updated_at") // Переконайтесь, що ім'я стовпця правильне
    private Date updated_at;
    @Column(name = "bar_code") // Переконайтесь, що ім'я стовпця правильне
    private String barcode;

    public Users() {
    }

    public Users(Integer id, String firstname, String lastname, String email, String bio, String role, String password, String avatar, Date created_at, Date updated_at, String barcode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.bio = bio;
        this.role = role;
        this.password = password;
        this.avatar = avatar;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.barcode = barcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(firstname, users.firstname) && Objects.equals(lastname, users.lastname) && Objects.equals(email, users.email) && Objects.equals(bio, users.bio) && Objects.equals(role, users.role) && Objects.equals(password, users.password) && Objects.equals(avatar, users.avatar) && Objects.equals(created_at, users.created_at) && Objects.equals(updated_at, users.updated_at) && Objects.equals(barcode, users.barcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, email, bio, role, password, avatar, created_at, updated_at, barcode);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", bio='" + bio + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", barcode='" + barcode + '\'' +
                '}';
    }
}
