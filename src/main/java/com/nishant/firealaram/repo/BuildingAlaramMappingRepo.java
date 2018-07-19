package com.nishant.firealaram.repo;

import com.nishant.firealaram.entity.BuildingAlaramMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingAlaramMappingRepo extends JpaRepository<BuildingAlaramMapping,Integer> {
}
