package com.springboot.crudDemo.repository;

import com.springboot.crudDemo.bean.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, String> {
}
