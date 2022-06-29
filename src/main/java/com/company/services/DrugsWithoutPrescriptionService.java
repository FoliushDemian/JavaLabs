package com.company.services;

import com.company.model.DrugsWithoutPrescription;
import com.company.repository.DrugsWithoutPrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DrugsWithoutPrescriptionService {
    private final DrugsWithoutPrescriptionRepository drugsWithoutPrescriptionRepository;

    @Autowired
    public DrugsWithoutPrescriptionService(DrugsWithoutPrescriptionRepository drugsWithoutPrescriptionRepository) {
        this.drugsWithoutPrescriptionRepository = drugsWithoutPrescriptionRepository;
    }

    public void create(DrugsWithoutPrescription drugsWithoutPrescription) {
        drugsWithoutPrescriptionRepository.save(drugsWithoutPrescription);
    }

    public List<DrugsWithoutPrescription> getAll() {
        return drugsWithoutPrescriptionRepository.findAll();
    }

    public DrugsWithoutPrescription getById(Integer id) {
        return drugsWithoutPrescriptionRepository.findById(id).orElseThrow();
    }


    public void update(Integer id, String nameOfMedicine) {
        DrugsWithoutPrescription drugsWithoutPrescription = drugsWithoutPrescriptionRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id.toString() + "not found such object"));
        drugsWithoutPrescription.setNameOfMedicine(nameOfMedicine);
    }

    public void deleteById(Integer id) {
        drugsWithoutPrescriptionRepository.deleteById(id);
    }
}
