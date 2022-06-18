package com.example.onetomanymapping.Controller;

import com.example.onetomanymapping.Entity.User;
import com.example.onetomanymapping.Repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Datahandler {

    @Autowired
    private
    UserRepositry userRepositry;
     @RequestMapping("/Mapping")
    public String datacapture()
    {
        userRepositry.save(new User());

        return "Data entered for one to one Mapping";
    }
}
