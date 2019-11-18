package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAndEmployeeFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompaniesWithNamesContaining(String namePart) {
        List<Company> companiesContaining = companyDao.retrieveCompaniesWithNameContaining("%" + namePart + "%");
        return companiesContaining;
    }

    public List<Employee> findEmployeesWithLastNamesContaining(String namePart) {
        List<Employee> employeesContaining = employeeDao.retrieveEmployeesWithLastNameContaining("%" + namePart + "%");
        return employeesContaining;
    }
}
