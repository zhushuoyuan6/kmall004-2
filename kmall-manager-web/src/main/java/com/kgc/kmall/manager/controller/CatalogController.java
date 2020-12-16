package com.kgc.kmall.manager.controller;


import com.kgc.kmall.bean.PmsBaseCatalog1;
import com.kgc.kmall.bean.PmsBaseCatalog2;
import com.kgc.kmall.bean.PmsBaseCatalog3;
import com.kgc.kmall.service.CataogService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class CatalogController {

    @Reference
    CataogService catalogService;

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1List = catalogService.getCatalog1();
        return catalog1List;
    }
    @RequestMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id){
        List<PmsBaseCatalog2> catalog2List = catalogService.getCatalog2(catalog1Id);
        return catalog2List;
    }
    @RequestMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(Long catalog2Id){
        List<PmsBaseCatalog3> catalog3List = catalogService.getCatalog3(catalog2Id);
        return catalog3List;
    }
}