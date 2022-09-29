package com.mb.api.runners;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.repository.EmployeeRepository;

@Component
public class FetchTypeRunner implements CommandLineRunner
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		
		List<Object[]> empData = employeeRepository.getEmpNameAndDept();
		
		for(Object[] object : empData) {
			System.out.println(object[0] + "====" + object[1]);
		}
		
		
		Object[] obj = (Object[])employeeRepository.getEmpNameAndDeptById(56);
		System.out.println(obj[0] + "=============" + obj[1]);
	}

}
 