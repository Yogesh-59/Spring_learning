package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    // curl localhost: 8080/hello -w "\n"
    @RequestMapping (value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }
    // curl localhost: 8080/hello/query?name= Aryan
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello" + name + "!";
    }
    // curl localhost: 8080/hello/param/Narayan -w "\n"
    @GetMapping("/param/ {name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    @PostMapping ("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() +" !";
    }
    @PutMapping ("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName)
    {
        return "Hello " + firstName + " " + lastName+"!";
    }

}