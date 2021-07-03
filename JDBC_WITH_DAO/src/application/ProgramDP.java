package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDP {

	public static void main(String[] args) {
		
        DepartmentDao dpp = DaoFactory.createDepartmentDao();
		Department dp = new Department(null,"Eng");
		List<Department> list = new ArrayList<>();
		list = dpp.findAll();
		list.forEach(System.out::println);
		
		
	
		
		
		
		
	}

}
