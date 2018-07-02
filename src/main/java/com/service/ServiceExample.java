package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.DaoExample;
//@Component
@Service
public class ServiceExample {
	
	@Autowired
	private DaoExample edao;

	public ServiceExample(DaoExample edao) {
   System.out.println("service has been created");
		this.edao = edao;
	}
	
	public void printFromDao() {
		edao.printMyMsg();
	}

}
