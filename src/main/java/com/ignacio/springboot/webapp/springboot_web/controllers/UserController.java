package com.ignacio.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "Hola Mundo Spring Framework Con Model");
    model.addAttribute("name", "Nacho");
    model.addAttribute("lastname", "Cardozo");
    return "details";
    // nombre de la plantillas debe ir para que funcione
    // osea los archivos que estan en la carpeta utils
  }

  @GetMapping("/map")
  public String map(Map<String, Object> map) {
    map.put("title", "Hola Mundo Spring Framework Con Map");
    map.put("name", "Erica Abigail de los Angeles");
    map.put("lastname", "Condori");

    return "map";
  }

}
// si se trabaja con la anotacion @Controlle es porque se trabaja con vistas
// HTML que son de lado del servidor