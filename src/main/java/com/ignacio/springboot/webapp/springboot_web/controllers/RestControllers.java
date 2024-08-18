package com.ignacio.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ignacio.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
// Devuelve la informacion como un json para que pueda ser
// utilizado por react, angular,etc
public class RestControllers {

  @GetMapping("/details")
  public Map<String, Object> details() {
    User user = new User("Nacho", "Cardozo");
    Map<String, Object> response = new HashMap<>();
    response.put("title", "Hola Mundo Spring Framework Con Model");
    response.put("user", user);
    return response;
    // Cuando es RESTCONTROLLERS => JSON
    // Cuando es CONTROLLERS => vistas del servidor como THYMELEAF
  }

  // Otra forma de hacer lo de arriba seria asi
  @RequestMapping(path = "/details2", method = RequestMethod.GET)
  public Map<Integer, Object> numero() {
    Map<Integer, Object> numeros = new HashMap<>();
    numeros.put(1, "nacho");
    numeros.put(2, "eri");
    numeros.put(3, "abigail");

    return numeros;
  }

}
// si se trabaja con la anotacion @Controlle es porque se trabaja con vistas
// HTML que son de lado del servidor