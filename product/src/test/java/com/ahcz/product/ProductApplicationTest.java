package com.ahcz.product;

import com.ahcz.product.entity.BrandEntity;
import com.ahcz.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductApplicationTest {


    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
//        BrandEntity brand = new BrandEntity();
//        brand.setName("华为");
//        brandService.save(brand);
//        System.out.println("保存成功。。。。");

        BrandEntity entity = brandService.getOne(new LambdaQueryWrapper<BrandEntity>().eq(BrandEntity::getBrandId, "1"));
        System.out.println(entity);
    }
}
