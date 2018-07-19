package com.nishant.firealaram.service;

import com.nishant.firealaram.dto.CorporationAlaramMappingDto;
import com.nishant.firealaram.dto.CorporationBuildingMappingDto;
import com.nishant.firealaram.entity.*;

public interface CommonService {
    public Alaram saveAlaram(Alaram alaram);
    public Building saveBuilding(Building building);
    public Corporation saveCorporation(Corporation corporation);
    public CorporationAlaramMapping saveCorporationAlaramMapping(CorporationAlaramMappingDto corporationAlaramMapping);
    public BuildingAlaramMapping saveBuildingAlaram(BuildingAlaramMapping buildingAlaramMapping);
    public CoporationBuildingMappig saveCorporationBuildingMapping(CorporationBuildingMappingDto corporationBuildingMappingDto);


}
