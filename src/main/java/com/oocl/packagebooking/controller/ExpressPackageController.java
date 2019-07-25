package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.service.ExpressPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "expressPackage")
public class ExpressPackageController {

    @Autowired
    ExpressPackageService expressPackService;

    @GetMapping
    public ResponseEntity getAllPackage() {
        return ResponseEntity.ok(expressPackService.getAllPackage());
    }
}
