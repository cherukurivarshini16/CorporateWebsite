package com.example.corporatewebsite.controller;

import com.example.corporatewebsite.service.WebsiteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final WebsiteService websiteService;

    public HomeController(WebsiteService websiteService) {
        this.websiteService = websiteService;
    }

    @GetMapping("/")
    public String home() {

        // Calls the service layer
        websiteService.getCompanyInfo();

        // Opens index.html from static folder
        return "forward:/index.html";
    }

}