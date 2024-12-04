package com.deber.service;

import com.deber.model.doctor;
import com.deber.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class DoctorService {

	private DoctorRepository doctorRepository;
	public doctor createDoctor(doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
