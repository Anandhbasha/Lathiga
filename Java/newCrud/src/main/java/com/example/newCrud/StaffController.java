package com.example.newCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StaffController {
    @Autowired
    private  StaffReposiry repo;

//    read Method
    @GetMapping("/all")
    public  List <Staff> getAll(){
        return repo.findAll();
    }
}
