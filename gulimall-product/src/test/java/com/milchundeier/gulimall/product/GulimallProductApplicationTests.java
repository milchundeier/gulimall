package com.milchundeier.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.milchundeier.gulimall.product.entity.BrandEntity;
import com.milchundeier.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("Huawei");
//        brandService.updateById(brandEntity);
//
//        System.out.println("saved...");

List<BrandEntity> list =  brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
list.forEach(System.out::println);
    }

}
