package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.model.ExpressPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressPackageRepository extends JpaRepository<ExpressPackage, Long> {
}
