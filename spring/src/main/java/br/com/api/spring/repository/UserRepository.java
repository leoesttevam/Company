package br.com.api.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.spring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
