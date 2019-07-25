package com.oocl.packagebooking.service;

import com.oocl.packagebooking.dto.AppointmentDto;
import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.repository.ExpressPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void setAppointment(AppointmentDto appointmentDto) {
        ExpressPackage expressPackage = expressPackageRepository.findById(appointmentDto.getId()).orElse(null);
        if (expressPackage!=null) {
            expressPackage.setStatus("Appointment");
            expressPackage.setTime(appointmentDto.getTime());
            expressPackageRepository.save(expressPackage);
        }

    }
}
