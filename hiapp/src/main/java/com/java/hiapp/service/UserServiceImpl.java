package com.java.hiapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.hiapp.dao.UserMRepository;
import com.java.hiapp.entity.Department;
import com.java.hiapp.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMRepository repo;

	@Override
	public void createUser(User user) {

		List<Department> department = user.getDepartment();
		List<Department> departmentlist = new ArrayList<Department>();
		for (Department department2 : department) {
			Department dep = new Department();
			dep.setName(department2.getName());
			dep.setUser(user);
			departmentlist.add(dep);
		}
		user.setDepartment(departmentlist);
		repo.save(user);
	}

	@Override
	public List<User> findAll() {
		return repo.findAll();
	}
}