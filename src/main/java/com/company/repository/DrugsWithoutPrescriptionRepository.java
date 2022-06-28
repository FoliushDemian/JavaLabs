package com.company.repository;

import com.company.model.DrugsWithoutPrescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugsWithoutPrescriptionRepository extends JpaRepository<DrugsWithoutPrescription, Integer> {

}
