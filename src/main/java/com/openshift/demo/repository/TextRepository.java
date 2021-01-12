package com.openshift.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openshift.demo.entity.Text;

@Repository
public interface TextRepository extends CrudRepository<Text, Long> {

    Text findById(long id);
}
