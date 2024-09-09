package com.halid.mservice.citlist.repository;

import com.halid.mservice.citlist.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

    @Override
    long count();

//    Page<DBCitizenDTO> findAllBy(Pageable pageable);
//
//    Page<DBCitizenDTO> findAllBy(Pageable pageable, String filter);

}
