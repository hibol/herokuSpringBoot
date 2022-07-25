package com.hibol.herokkuapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HerokuAppController {
	@RequestMapping("/")
    String home() {
      return "home";
    }
}
