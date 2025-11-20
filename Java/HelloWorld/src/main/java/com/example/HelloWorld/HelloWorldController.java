package com.example.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    String Greet(){
        return  "Hello World";
    }
    @GetMapping("/{id}")
    String getUserID(@PathVariable long id){
        return  "The user id is:" + id;
    }

    @GetMapping
    String getUserIDQuery(@RequestParam long id){
        return  "The user id is:" + id;
    }

    @PostMapping("/create")
    String getUserIDQuery(@RequestBody String body){
        return  body;
    }

    @PutMapping("/create/{id}")
    String editUserIDQuery(@PathVariable long id){
        return  "Update user"+id;
    }

    @DeleteMapping ("/delete/{id}")
    String deleteUserIDQuery(@PathVariable long id){
        return  id + " User Deleted";
    }

}
