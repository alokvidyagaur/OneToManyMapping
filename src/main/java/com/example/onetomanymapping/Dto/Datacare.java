package com.example.onetomanymapping.Dto;

import com.example.onetomanymapping.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class Datacare {
    @Autowired
    private User user;


    public void savedata()
    {
         user.setDateofbirth(LocalDate.of(2022,9,9));;
         user.setEmail("Alokiit14@gmail.com");
         user.setName("Alok");

    }

        }
