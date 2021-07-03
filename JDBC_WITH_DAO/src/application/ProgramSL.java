package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramSL {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== TESTE 1: seller find By Id===");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println("==== TESTE 2: seller find By Department Id===");
		System.out.println();
		Department department = new Department(1,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		
		System.out.println("==== TESTE 3: seller findAll===");

		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		
		System.out.println("==== TESTE 4: Inserction===");
		//Integer id, String name, String email, Date birthDate, Double baseSalary, Department department
		Seller Seler = new Seller(null,"Felipe","lipehbr@gmail.com",new java.sql.Date(seller.getBirthDate().getTime()),300.0,department);
        sellerDao.insert(Seler);
        System.out.println("New User Id : "+Seler.getId());
        
        Department dp = new Department(null,"Engenharia Mecatrônica");
        departmentDao.insert(dp);
        
        
        
        System.out.println("==== TESTE 5: Seller Update===");
        seller = sellerDao.findById(1);
        seller.setName("Messi");
        sellerDao.update(seller);
        System.out.println("Updated Completed");
        
        
        System.out.println("==== TESTE 6: Seller DELETE!===");
        System.out.println("Entre com um ID : ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed!");
        sc.close();
        
	}

}
