package com.nishant.firealaram.repo;

import com.nishant.firealaram.entity.Building;
import com.nishant.firealaram.entity.Corporation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BuildingRepo extends JpaRepository<Building,Integer> {
    @Query("Select c from Building c where c.buildingName= :buildingName")
    public Building findBuildingByName(@Param("buildingName")String buildingName);
}
