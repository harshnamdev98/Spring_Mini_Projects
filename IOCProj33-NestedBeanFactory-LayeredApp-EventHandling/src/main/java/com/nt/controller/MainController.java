package com.nt.controller;

import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;

public class MainController {
	private EmployeeMgmtService service;
	
	public MainController(EmployeeMgmtService service) {
		this.service = service;
	}

	public List<EmployeeDTO> searchEmpsByDesgs(String desg1,String desg2,String desg3)throws Exception{
		List<EmployeeDTO> listDTO=null;
		//use Service class
		listDTO=service.getEmpsByDesgs(desg1, desg2, desg3);
		return listDTO;
	}

}
