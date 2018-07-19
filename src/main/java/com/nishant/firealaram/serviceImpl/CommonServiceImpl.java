package com.nishant.firealaram.serviceImpl;

import com.nishant.firealaram.dto.CorporationAlaramMappingDto;
import com.nishant.firealaram.dto.CorporationBuildingMappingDto;
import com.nishant.firealaram.entity.*;
import com.nishant.firealaram.exceptionhandler.AlaramNaotFoundException;
import com.nishant.firealaram.exceptionhandler.BuildingNotFoundException;
import com.nishant.firealaram.exceptionhandler.CorporationNotFoundException;
import com.nishant.firealaram.repo.*;
import com.nishant.firealaram.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private AlaramRepo alaramRepo;
    @Autowired
    private CorporationRepo corporationRepo;
    @Autowired
    private CorporationAlaramMappingRepo corporationAlaramMappingRepo;
    @Autowired
    private BuildingAlaramMappingRepo buildingAlaramMappingRepo;
    @Autowired
    private BuildingRepo buildingRepo;
    @Autowired
    private CorporationBuildingMappingRepo corporationBuildingMappingRepo;
    @Override
    public Alaram saveAlaram(Alaram alaram) {
        Alaram savedAlaram= new Alaram();
        try{
            savedAlaram= alaramRepo.save(alaram);
        }catch (Exception e){
            e.printStackTrace();
        }
        return savedAlaram;
    }

    @Override
    public Building saveBuilding(Building building) {
        Building savedBuilding= new Building();
        try{
            savedBuilding= buildingRepo.save(building);
        }catch (Exception e){
            e.printStackTrace();
        }
        return savedBuilding;
    }

    @Override
    public Corporation saveCorporation(Corporation corporation) {
        Corporation savedCorporation= new Corporation();
        try{
            savedCorporation= corporationRepo.save(corporation);
        }catch (Exception e){
            e.printStackTrace();
        }
        return savedCorporation;
    }

    @Override
    public CorporationAlaramMapping saveCorporationAlaramMapping(CorporationAlaramMappingDto corporationAlaramMapping) {
        CorporationAlaramMapping savedCorporation= new CorporationAlaramMapping();

            Alaram alaram= alaramRepo.getOne(corporationAlaramMapping.getAlaramId());
            //throwing exception if result not available
            if(alaram.getAlaramId() == null){
                throw  new AlaramNaotFoundException("Invalid Alaram ID");
            }
            Corporation corporation= corporationRepo.findCorporationByName(corporationAlaramMapping.getCorporationName());
        //throwing exception if result not available
        if(corporation == null){
                throw  new CorporationNotFoundException("Invalid corporation Name");
            }
            CorporationAlaramMapping corporationAlaramMappingForSaving= new CorporationAlaramMapping();
            corporationAlaramMappingForSaving.setAlaramId(corporationAlaramMapping.getAlaramId());
            corporationAlaramMappingForSaving.setCorporationId(corporation.getId());
            //saving
            savedCorporation= corporationAlaramMappingRepo.save(corporationAlaramMappingForSaving);

        return savedCorporation;
    }

    @Override
    public BuildingAlaramMapping saveBuildingAlaram(BuildingAlaramMapping buildingAlaramMapping) {
        BuildingAlaramMapping savedAlaram= new BuildingAlaramMapping();
        try{
            savedAlaram= buildingAlaramMappingRepo.save(buildingAlaramMapping);
        }catch (Exception e){
            e.printStackTrace();
        }
        return savedAlaram;
    }

    @Override
    public CoporationBuildingMappig saveCorporationBuildingMapping(CorporationBuildingMappingDto corporationBuildingMappingDto) {
        CoporationBuildingMappig savedCorporation= new CoporationBuildingMappig();

            Corporation corporation= corporationRepo.findCorporationByName(corporationBuildingMappingDto.getCorporationName());
        //throwing exception if result not available
        if(corporation == null){
                throw  new CorporationNotFoundException("Invalid corporation Name");
            }
            Building building= buildingRepo.findBuildingByName(corporationBuildingMappingDto.getBuildingName());
        //throwing exception if result not available
        if(building == null){
                throw  new BuildingNotFoundException("Invalid building Name");
            }
            CoporationBuildingMappig coporationBuildingMappig= new CoporationBuildingMappig();
            coporationBuildingMappig.setBuildingId(building.getId());
            coporationBuildingMappig.setCorporationId(corporation.getId());
            coporationBuildingMappig.setStatus(true);
            //saving
            savedCorporation= corporationBuildingMappingRepo.save(coporationBuildingMappig);


        return savedCorporation;
    }
}
