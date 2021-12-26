package com.github.lastsunday.cloud.multidatasource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.lastsunday.cloud.multidatasource.bo.ProductBO;
import com.github.lastsunday.cloud.multidatasource.entity.ProductEntity;

import java.util.List;

public interface ProductMapper extends BaseMapper<ProductEntity> {

    List<ProductEntity> queryGoodInfoByGoodId(ProductBO productBO);

}
