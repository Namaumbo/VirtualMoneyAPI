package com.application.ATM.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="`User`")
public class User
{

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "AccountDetail_id")
        private AccountDetail accountDetail;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int Id;

        @Column(name = "first_name", nullable = false)
        @NonNull
        private String firstName;
        @Column(name = "last_name", nullable = false)
        private String lastName;
        @Column(name = "national_id_number", nullable = false)
        private String nationalIdNumber;
        @Column(name = "city" , nullable = false)
        private String city;
        @Column(name = "phone_number" , nullable = false, unique = true)
        private String phoneNumber;
        @Column(name = "email",nullable = false,unique = true)
        private String email;
        @Column(name ="password",nullable = false,unique = true)
        private String password;

        public User() {
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getNationalIdNumber() {
            return nationalIdNumber;
        }

        public void setNationalIdNumber(String nationalIdNumber) {
            this.nationalIdNumber = nationalIdNumber;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
        return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}
