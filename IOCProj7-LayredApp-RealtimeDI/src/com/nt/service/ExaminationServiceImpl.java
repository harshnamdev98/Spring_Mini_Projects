package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class ExaminationServiceImpl implements ExaminationService {
    private StudentDAO dao;
    
    public ExaminationServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

   
   
	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		StudentBO bo=null;
		int total=0;
		float avg=0.0f;
		String result=null;
		int count=0;
		
		//write b.logic /service logic
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if(dto.getM1()<35 || dto.getM2()<35 || dto.getM3()<35)
			result="fail";
		else
			result="pass";
		//prepare BO having Persistable Data
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "Registration failed:: result is::"+result;
		else 
			return "Registraion succeded:: result is::"+result;
	}

}
