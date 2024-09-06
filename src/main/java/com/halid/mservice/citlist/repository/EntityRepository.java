package com.halid.mservice.citlist.repository;

import org.springframework.data.repository.CrudRepository;

public interface EntityRepository<T> extends CrudRepository<T, Integer> {



}
