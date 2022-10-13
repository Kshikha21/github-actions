package com.example.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  /*  echo "# github-actions" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/Kshikha21/github-actions.git
    git push -u origin main
*/

    @GetMapping("/welcome")
    public String welcomingMethod(){
        return "Welcome to Application!";
    }
}
