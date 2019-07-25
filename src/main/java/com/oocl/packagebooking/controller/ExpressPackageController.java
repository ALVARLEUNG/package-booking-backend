package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.service.ExpressPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "expressPackage")
@CrossOrigin(origins = { "http://localhost:8082", "http://localhost:8099" }, maxAge = 6000)
public class ExpressPackageController {

    @Autowired
    ExpressPackageService expressPackService;

    @GetMapping
    public ResponseEntity getAllPackage() {
        return ResponseEntity.ok(expressPackService.getAllPackage());
    }

    @PostMapping(produces = {"application/json"})
    public ResponseEntity addPackageAppointment(@RequestBody ExpressPackage expressPackage) {
        expressPackService.addPackageAppointment(expressPackage);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
