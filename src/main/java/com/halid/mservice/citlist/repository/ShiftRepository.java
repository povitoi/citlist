package com.halid.mservice.citlist.repository;

import com.halid.mservice.citlist.entity.ShiftRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface ShiftRepository extends JpaRepository<ShiftRecord, Integer> {

    @Query("select r from ShiftRecord r")
    Page<ShiftRecord> findAllRecords(Pageable pageable);

    @Query(value = "select s.c_shift_opened from citlist.t_shift_status s", nativeQuery = true)
    boolean findOpenedShift();

    @Modifying
    @Query(value = "update citlist.t_shift_status " +
            "set c_shift_opened=true, c_shift_opening_time=:timestamp " +
            "where id=1", nativeQuery = true)
    void setShiftStatusInOpen(Timestamp timestamp);
}
