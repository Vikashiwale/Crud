package com.cjc.main.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
   @Autowired 
   HomeRepository hr;
	@Override
	public Student saveData(Student s) {
		// TODO Auto-generated method stub
		return hr.save(s);
	}
	@Override
	public Student loginCheck(String un, String ps) {
		// TODO Auto-generated method stub
		return hr.findByUnameAndPass(un,ps);
	}
	@Override
	public Iterable<Student> ShowData() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}
	@Override
	public Student editData(int sid) {
		// TODO Auto-generated method stub
		return hr.findBySid(sid);
	}

}
