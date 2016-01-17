package com.vigi.payroll;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by vigi on 12/29/2015.
 */

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
