package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.SpringTest;
//@Component 
@Repository
public class DaoExample {
	
	@Autowired
 private SpringTest springTest;
  
 
  
  public DaoExample(SpringTest springTest) {
	this.springTest = springTest;
}



public void printMyMsg() {
	  springTest.printYourMessage();
  }
}
