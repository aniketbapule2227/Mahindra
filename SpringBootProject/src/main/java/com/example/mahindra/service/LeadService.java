package com.example.mahindra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mahindra.entity.Lead;
import com.example.mahindra.exception.LeadAlreadyExistsException;
import com.example.mahindra.repository.LeadRepository;

@Service
public class LeadService {
    @Autowired
    private LeadRepository leadRepository;

    public Lead createLead(Lead lead) {
        if (leadRepository.existsById(lead.getLeadID())) {
            throw new LeadAlreadyExistsException("Lead Already Exists in the database with the lead id");
        }
       
        return leadRepository.save(lead);
    }
  
        public List<Lead> getLeadsByMobileNumber(String mobileNumber) {
            return leadRepository.findByMobileNumber(mobileNumber);
        }
    }



