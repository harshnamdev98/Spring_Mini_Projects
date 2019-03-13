package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.ExaminationService;
import com.nt.vo.StudentVO;

public class MainController {
	private ExaminationService service;

	public MainController(ExaminationService service) {
		this.service = service;
	}
	
	public String process(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		//Convert VO class obj to DTO class obj
		dto=new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use Service
		result=service.generateResult(dto);
		return result;
	}
	

}
