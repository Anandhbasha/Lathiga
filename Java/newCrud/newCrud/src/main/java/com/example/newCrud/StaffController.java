package com.example.newCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class StaffController {
    @Autowired
    private  StaffRepository repo;

//    read Method
    @GetMapping("/all")
    public  List <Staff> getAll(){
        return repo.findAll();
    }

// insertMethod
    @PostMapping("/add")
    public String addStaff(@RequestBody Staff s){
        repo.save(s);
        return  "inserted successfully";
    }

//    edit Method
    @PutMapping("/{id}")
    public String update(@PathVariable Integer id,@RequestBody Staff newData){
        Staff old = repo.findById(id).orElse(null);
        if(old==null){
            return "ID Not found";
        }
        if(newData.getAge()!=null)old.setAge(newData.getAge());
        if(newData.getName()!=null)old.setName(newData.getName());
        if(newData.getCity()!=null)old.setCity(newData.getCity());
        if(newData.getCourse()!=null)old.setCourse(newData.getCourse());
        if(newData.getMobile()!=null)old.setMobile(newData.getMobile());
        if(newData.getSalary()!=null)old.setSalary(newData.getSalary());

        repo.save(old);
        return  "Updated Successfully";
    }

//    delete
    @DeleteMapping("/{id}")
    public  String delete(@PathVariable Integer id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return  "Deleted Succesfully";
        }
        return "Id not found";
    }
}
