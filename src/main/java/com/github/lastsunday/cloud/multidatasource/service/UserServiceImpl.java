package com.github.lastsunday.cloud.multidatasource.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.github.lastsunday.cloud.multidatasource.bo.ProductBO;
import com.github.lastsunday.cloud.multidatasource.entity.ProductEntity;
import com.github.lastsunday.cloud.multidatasource.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<ProductEntity> selectFromMaster(ProductBO productBO) {
        return productMapper.queryGoodInfoByGoodId(productBO);
    }

    @DS("slave_1")
    @Override
    public List<ProductEntity> selectFromSlave1(ProductBO productBO) {
        return productMapper.queryGoodInfoByGoodId(productBO);
    }

    @DS("slave_2")
    @Override
    public List<ProductEntity> selectFromSlave2(ProductBO productBO) {
        return productMapper.queryGoodInfoByGoodId(productBO);
    }
}
