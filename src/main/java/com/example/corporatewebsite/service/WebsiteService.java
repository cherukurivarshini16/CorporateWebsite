package com.example.corporatewebsite.service;

import com.example.corporatewebsite.model.Company;
import org.springframework.stereotype.Service;

@Service
public class WebsiteService {

    public Company getCompanyInfo() {

        return new Company(
                "ABC Technologies",
                "Innovating for a Better Tomorrow",
                "info@abctechnologies.com",
                "+91 9876543210",
                "Hyderabad, Telangana, India"
        );

    }

}