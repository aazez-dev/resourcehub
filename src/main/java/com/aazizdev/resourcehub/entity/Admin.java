package com.aazizdev.resourcehub.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    @Column(name = "Admin_id")
    private UUID adminId;


    @Column(name = "user_id")
    private UUID user;

    public Admin(){

    }

    public void setAdminId(UUID adminId){
        this.adminId = adminId;
    }
    public UUID getAdminId()
    {
       return adminId;
    }

    public void setUser(UUID user){
        this.user = user;
    }
    public UUID getUser(){
        return user;
    }
}
