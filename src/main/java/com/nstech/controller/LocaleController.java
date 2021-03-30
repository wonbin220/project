package com.nstech.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("localeController")
public class LocaleController {
   @RequestMapping(value="/*/*.do", method={RequestMethod.GET})
   public String locale(HttpServletRequest request, HttpServletResponse response) 
                                                          throws Exception {
      System.out.println("localeController입니다");
      return "locale";
   }
}