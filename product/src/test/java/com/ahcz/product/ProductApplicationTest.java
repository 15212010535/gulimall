package com.ahcz.product;

import com.ahcz.product.entity.BrandEntity;
import com.ahcz.product.service.BrandService;
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
        BrandEntity brand = new BrandEntity();
        brand.setName("华为");
        brandService.save(brand);
        System.out.println("保存成功。。。。");
    }
}
