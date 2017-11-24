package org.xxz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.xxz.domain.Customer;

@Mapper
public interface CustomerMapper {

    Customer getById(@Param("customerId")String customerId);

}
