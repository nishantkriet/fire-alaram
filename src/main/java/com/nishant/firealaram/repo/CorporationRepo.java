package com.nishant.firealaram.repo;

import com.nishant.firealaram.entity.Corporation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CorporationRepo extends JpaRepository<Corporation,Integer> {
    @Query("Select c from Corporation c where c.corporationName= :corporationName")
    public Corporation findCorporationByName(@Param("corporationName")String corporationName);
}
