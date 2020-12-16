package com.kgc.kmall.manager.kamllmanagerservice;



import com.kgc.kmall.bean.PmsBaseCatalog1;

import com.kgc.kmall.service.CataogService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class KamllManagerServiceApplicationTests {
	@Resource
	CataogService catalogService;

	@Test
	void contextLoads() {
		List<PmsBaseCatalog1> pmsBaseCatalog1s = catalogService.getCatalog1();
		for (PmsBaseCatalog1 member : pmsBaseCatalog1s) {
			System.out.println(member.toString());
		}
	}
}
