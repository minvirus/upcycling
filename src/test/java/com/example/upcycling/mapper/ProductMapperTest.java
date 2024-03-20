package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.vo.MainProductVo;
import com.example.upcycling.domain.vo.ProductVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductMapperTest {
    @Autowired
    ProductMapper productMapper;
    
//    @Test
//    void selectAll(){
//        List<ProductVo> selectAll = productMapper.selectAll();
//        System.out.println("selectAll = " + selectAll);
//    }
    @Test
    void ses(){
        List<MainProductVo> mainProductVos = productMapper.selectProductInfoImg();
        System.out.println("mainProductVos = " + mainProductVos);
    }
}