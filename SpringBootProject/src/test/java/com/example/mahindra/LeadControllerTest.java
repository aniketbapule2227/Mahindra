package com.example.mahindra;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.mahindra.controller.LeadController;
import com.example.mahindra.entity.Lead;
import com.example.mahindra.service.LeadService;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.sql.Date;

public class LeadControllerTest {
    @InjectMocks
    private LeadController leadController;

    @Mock
    private LeadService leadService;

    @Test
    public void testCreateLead() {
        MockitoAnnotations.openMocks(this);
        
        Lead lead = new Lead(1L, 123, "John", "Doe", "Smith", "1234567890", "Male", new Date(10-12-2023), "john.doe@example.com");

       

        when(leadService.createLead(lead)).thenReturn(lead);

        ResponseEntity<Object> responseEntity = leadController.createLead(lead);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        verify(leadService, times(1)).createLead(lead);
    }

}

