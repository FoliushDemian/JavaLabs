package com.company.controllers;

import com.company.model.DrugsWithoutPrescription;
import com.company.services.DrugsWithoutPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/all")
public class DrugsWithoutPrescriptionController {
    private AtomicInteger idCounter = new AtomicInteger();
    private Map<Integer, DrugsWithoutPrescription> drugs = new HashMap<>();

    private  final DrugsWithoutPrescriptionService drugsWithoutPrescriptionService;

    @Autowired
    public DrugsWithoutPrescriptionController(DrugsWithoutPrescriptionService drugsWithoutPrescriptionService) {
        this.drugsWithoutPrescriptionService = drugsWithoutPrescriptionService;
    }

    @GetMapping
    private List<DrugsWithoutPrescription> getAll() {
        return new LinkedList<>(drugs.values());
    }

    @GetMapping("/{id}")
    private ResponseEntity<DrugsWithoutPrescription> getById(@PathVariable("id") Integer id) {
        HttpStatus status = drugs.get(id) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).body(drugs.get(id));
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    private DrugsWithoutPrescription creation(@RequestBody DrugsWithoutPrescription drugsWithoutPrescription) {
        drugsWithoutPrescriptionService.create(drugsWithoutPrescription);

        drugsWithoutPrescription.setId(idCounter.incrementAndGet());
        drugs.put(drugsWithoutPrescription.getId(), drugsWithoutPrescription);
        return  drugsWithoutPrescription;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<DrugsWithoutPrescription> update(
            final @PathVariable("id") Integer id,
            final @RequestBody DrugsWithoutPrescription drugsWithoutPrescription) {
        HttpStatus status = drugs.put(id, drugsWithoutPrescription) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        drugsWithoutPrescription.setId(id);

        return ResponseEntity.status(status).body(drugs.get(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DrugsWithoutPrescription> delete(@PathVariable("id") Integer id) {
        HttpStatus status = drugs.remove(id) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;

        return ResponseEntity.status(status).build();
    }
}
