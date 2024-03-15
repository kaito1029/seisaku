package com.example.ginkou2.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class Main2 {
  @GetMapping("/aaa")
  public String index(Model model) {
    model.addAttribute("message", "通帳情報");
    return "top2";
  }
}
