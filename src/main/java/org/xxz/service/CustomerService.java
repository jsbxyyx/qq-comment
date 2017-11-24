package org.xxz.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.xxz.domain.Customer;
import org.xxz.mapper.CustomerMapper;

@Service
public class CustomerService {
    
    @Resource
    private CustomerMapper customerDao;

    public Customer getCustomerByCustomerId(String customerId) {
        return customerDao.getById(customerId);
    }
    
    

}
