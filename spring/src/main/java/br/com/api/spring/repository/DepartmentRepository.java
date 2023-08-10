package br.com.api.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.spring.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
