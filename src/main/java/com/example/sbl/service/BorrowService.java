package com.example.sbl.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class BorrowService {
    public LocalDate convertDateViaInstant(Date dateToConvert) {
    	return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    public Date convertToDate(LocalDate dateToConvert) {
    	return java.util.Date.from(dateToConvert.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
	
	
	
}
