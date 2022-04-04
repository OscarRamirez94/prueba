package com.example.prueba.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.prueba.entity.Person;

@Repository
public interface PersonRepository  extends JpaRepository<Person, Long>{

}
