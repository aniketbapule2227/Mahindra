package com.example.mahindra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mahindra.entity.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
    boolean existsByLeadId(Long long1);

	List<Lead> findByMobileNumber(String mobileNumber);

	boolean existsById(Long leadID);
}
