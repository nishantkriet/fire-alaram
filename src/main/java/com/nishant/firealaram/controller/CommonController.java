package com.nishant.firealaram.controller;

import com.nishant.firealaram.dto.CorporationAlaramMappingDto;
import com.nishant.firealaram.dto.CorporationBuildingMappingDto;
import com.nishant.firealaram.entity.*;
import com.nishant.firealaram.service.CommonService;
import com.nishant.firealaram.utility.JsonFormatter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "firealaram")
public class CommonController {
    private static final Logger infoLog = LogManager.getLogger("infoLog");

    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/saveNewAlaram",method = RequestMethod.POST,consumes = "application/json")
    public Alaram saveNewAlaram(@RequestBody Alaram alaram){
        infoLog.info("save New Alaram Request "+JsonFormatter.getJsonObjectAsString(alaram));
        Alaram savedAlaram= new Alaram();
        try{
            savedAlaram= commonService.saveAlaram(alaram);
        }catch (Exception e){
            e.printStackTrace();
        }
        infoLog.info("save New Alaram Response "+JsonFormatter.getJsonObjectAsString(savedAlaram));

        return savedAlaram;
    }
    @RequestMapping(value = "/saveNewCorporation",method = RequestMethod.POST,consumes = "application/json")
    public Corporation saveNewCorporation(@RequestBody Corporation corporation){
        infoLog.info("save New corporation Request "+JsonFormatter.getJsonObjectAsString(corporation));

        Corporation savedCorporation= new Corporation();
        try{
            savedCorporation= commonService.saveCorporation(corporation);
        }catch (Exception e){
            e.printStackTrace();
        }
        infoLog.info("save New corporation response "+JsonFormatter.getJsonObjectAsString(savedCorporation));

        return savedCorporation;
    }
    @RequestMapping(value = "/saveNewBuilding",method = RequestMethod.POST,consumes = "application/json")
    public Building saveNewbuilding(@RequestBody Building building){
        Building savedBuilding= new Building();
        infoLog.info("save New Building Request "+JsonFormatter.getJsonObjectAsString(building));
        try{
            savedBuilding= commonService.saveBuilding(building);
        }catch (Exception e){
            e.printStackTrace();
        }
        infoLog.info("save New building Response "+JsonFormatter.getJsonObjectAsString(savedBuilding));

        return savedBuilding;
    }
    @RequestMapping(value = "/saveNewCorporationAlaramMapping",method = RequestMethod.POST,consumes = "application/json")
    public CorporationAlaramMapping saveNewCorporationAlaramMapping(@RequestBody CorporationAlaramMappingDto corporation){
        CorporationAlaramMapping savedCorporation= new CorporationAlaramMapping();
        infoLog.info("save New corporation and Alaram mapping Request "+JsonFormatter.getJsonObjectAsString(corporation));

            savedCorporation= commonService.saveCorporationAlaramMapping(corporation);
        infoLog.info("save New corporation and Alaram mapping Response "+JsonFormatter.getJsonObjectAsString(savedCorporation));

        return savedCorporation;
    }
    @RequestMapping(value = "/saveNewBuildingAlaramMapping",method = RequestMethod.POST,consumes = "application/json")
    public BuildingAlaramMapping saveNewBuildingAlaramMapping(@RequestBody BuildingAlaramMapping buildingAlaramMapping){
        BuildingAlaramMapping savedAlaram= new BuildingAlaramMapping();
        infoLog.info("save New building and Alaram mapping Request "+JsonFormatter.getJsonObjectAsString(buildingAlaramMapping));
            buildingAlaramMapping.setStatus(true);
            savedAlaram= commonService.saveBuildingAlaram(buildingAlaramMapping);
        infoLog.info("save New building and Alaram mapping Response "+JsonFormatter.getJsonObjectAsString(savedAlaram));
        return savedAlaram;
    }
    @RequestMapping(value = "/UnsuscribeBuildingAlaramMapping",method = RequestMethod.POST,consumes = "application/json")
    public BuildingAlaramMapping unsuscribeBuildingAlaramMapping(@RequestBody BuildingAlaramMapping buildingAlaramMapping){
        BuildingAlaramMapping savedAlaram= new BuildingAlaramMapping();
        infoLog.info("remove building and Alaram mapping Request "+JsonFormatter.getJsonObjectAsString(buildingAlaramMapping));
            buildingAlaramMapping.setStatus(false);
            savedAlaram= commonService.saveBuildingAlaram(buildingAlaramMapping);
        infoLog.info("remove  building and Alaram mapping Response "+JsonFormatter.getJsonObjectAsString(savedAlaram));
        return savedAlaram;
    }
    @RequestMapping(value = "/addcorporationbuildingmapping",method = RequestMethod.POST,consumes = "application/json")
    public CoporationBuildingMappig saveNewCorporationBuildingMapping(@RequestBody CorporationBuildingMappingDto corporationBuildingMappingDto){
        CoporationBuildingMappig coporationBuildingMappig= new CoporationBuildingMappig();
        infoLog.info("save New corporation and building mapping Request "+JsonFormatter.getJsonObjectAsString(corporationBuildingMappingDto));

            //buildingAlaramMapping.setStatus(false);
            coporationBuildingMappig= commonService.saveCorporationBuildingMapping(corporationBuildingMappingDto);
        infoLog.info("save New corporation and building mapping Response "+JsonFormatter.getJsonObjectAsString(coporationBuildingMappig));

        return coporationBuildingMappig;
    }


}
