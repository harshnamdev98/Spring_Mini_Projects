package com.nt.service;

import com.nt.dto.StudentDTO;

public interface ExaminationService {
	public String generateResult(StudentDTO dto)throws Exception;

}
