package com.example.simpledagger.model;

public class UserModel {
    private int id;//": 2,
    private String name;//": "Ervin Howell",
    private String username;//": "Antonette",
    private String email;//": "Shanna@melissa.tv",
    private Address address;
    //": {
//        "street": "Victor Plains",
//                "suite": "Suite 879",
//                "city": "Wisokyburgh",
//                "zipcode": "90566-7771",
//                "geo": {
//            "lat": "-43.9509",
//                    "lng": "-34.4618"
//        }
//    },
    private String phone;//": "010-692-6593 x09125",
    private String website;//": "anastasia.net",
    private Company company;
//        ": {
//        "name": "Deckow-Crist",
//                "catchPhrase": "Proactive didactic contingency",
//                "bs": "synergize scalable supply-chains"
//    }

    public UserModel(int id, String name, String username, String email, Address address, String phone, String website, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
