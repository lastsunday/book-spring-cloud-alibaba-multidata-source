package com.github.lastsunday.cloud.multidatasource.service;

import com.github.lastsunday.cloud.multidatasource.bo.ProductBO;
import com.github.lastsunday.cloud.multidatasource.entity.ProductEntity;

import java.util.List;

public interface UserService {

    List<ProductEntity> selectFromMaster(ProductBO productBO);

    List<ProductEntity> selectFromSlave1(ProductBO productBO);

    List<ProductEntity> selectFromSlave2(ProductBO productBO);

}
