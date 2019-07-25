package com.oocl.packagebooking.service;

import com.oocl.packagebooking.dto.AppointmentDto;
import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.repository.ExpressPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ExpressPackageService {

    @Autowired
    ExpressPackageRepository expressPackageRepository;

    public List<ExpressPackage> getAllPackage() {
        return expressPackageRepository.findAll();
    }

    public void addPackageAppointment(ExpressPackage expressPackage) {
        expressPackageRepository.save(expressPackage);
    }

    public void updatePackStatus(ExpressPackage expressPackage) {
        expressPackageRepository.save(expressPackage);
    }

    public ResponseEntity setAppointment(AppointmentDto appointmentDto) {
        ExpressPackage expressPackage = expressPackageRepository.findById(appointmentDto.getId()).orElse(null);
        int resultTime = getTimeHour(appointmentDto);
        if (expressPackage!=null && resultTime>=9 && resultTime<20) {
            expressPackage.setStatus("Appointment");
            expressPackage.setTime(appointmentDto.getTime());
            expressPackageRepository.save(expressPackage);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

    private int getTimeHour(AppointmentDto appointmentDto) {
        String[] timeNodes = appointmentDto.getTime().toString().split(" ");
        return Integer.parseInt(timeNodes[3].substring(0,  timeNodes[3].indexOf(":")));
    }
}
