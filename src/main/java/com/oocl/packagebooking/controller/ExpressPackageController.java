package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.dto.AppointmentDto;
import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.service.ExpressPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:8082", "http://localhost:8099" }, maxAge = 6000)
@RestController
@RequestMapping(path = "expressPackage")
public class ExpressPackageController {

    @Autowired
    ExpressPackageService expressPackService;

//    @CrossOrigin(origins = { "http://localhost:8082", "http://localhost:8099" }, maxAge = 6000)
    @GetMapping
    public ResponseEntity getAllPackage() {
        return ResponseEntity.ok(expressPackService.getAllPackage());
    }

    @PostMapping(produces = {"application/json"})
    public ResponseEntity addPackageAppointment(@RequestBody ExpressPackage expressPackage) {
        expressPackService.addPackageAppointment(expressPackage);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping(produces = {"application/json"})
    public ResponseEntity updatePackageStatus(@RequestBody ExpressPackage expressPackage) {
        expressPackService.updatePackStatus(expressPackage);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/appointment")
    public ResponseEntity setAppointment(@RequestBody AppointmentDto appointmentDto) {
        expressPackService.setAppointment(appointmentDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
