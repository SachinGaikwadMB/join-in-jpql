package com.mb.api.persistance.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.mb.api.persistance.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	
	//@Query("SELECT e.name, d.code FROM Employee e INNER JOIN e.department d")
	
	//@Query("SELECT e.name, d.code FROM Employee e LEFT JOIN e.department d")

	//@Query("SELECT e.name, d.code FROM Employee e RIGHT JOIN e.department d")
	
	@Query("SELECT e.name, d.code FROM Employee e FULL JOIN e.department d")
	List<Object[]> getEmpNameAndDept();
	
	//@Query("SELECT e.name, d.code FROM Employee e INNER JOIN e.department d WHERE e.employeeId =:employeeId")
	//full outer doesnot support
	Object getEmpNameAndDeptById(@Param("employeeId") Integer employeeId);
	
	
	
	/*Syntax
	 * 
	 * 
	 * SELECT 
	 * 	
	 * FROM
	 *		
	 *		 PARENT_CLASS as p
	 *			[JOINTYPE]
	 *		p.<has_a_varibale> as c
	 * 
	 * WHERE
	 *     <condtion>
	 * 
	 * */
}
