package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.ExpressPackage;
import com.oocl.packagebooking.repository.ExpressPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressPackageService {

    @Autowired
    ExpressPackageRepository expressPackageRepository;

    public List<ExpressPackage> getAllPackage() {
        return expressPackageRepository.findAll();
    }
}
