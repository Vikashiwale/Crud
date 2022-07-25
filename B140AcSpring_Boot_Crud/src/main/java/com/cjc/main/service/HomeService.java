package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface HomeService {

	Student saveData(Student s);

	Student loginCheck(String un, String ps);

	Iterable<Student> ShowData();

	Student editData(int sid);

}
