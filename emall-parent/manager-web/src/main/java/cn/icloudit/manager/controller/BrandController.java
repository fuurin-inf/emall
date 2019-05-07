package cn.icloudit.manager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.iclodit.seller.service.BrandService;
import cn.icloudit.emall.entity.TbBrand;

@RestController
@RequestMapping("/brand")
public class BrandController {
	
	
	@Reference
	private BrandService brandService;
	
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return brandService.findAll();
	}
}
