package com.halid.mservice.citlist.repository;

import com.halid.mservice.citlist.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Integer> {

    @Override
    long count();

//    Page<DBTrasportDTO> findAllBy(Pageable pageable);
//
//    Page<DBTrasportDTO> findAllByBodyContainingIgnoreCaseOrModelContainingIgnoreCase(String filter,Pageable pageable);

}
