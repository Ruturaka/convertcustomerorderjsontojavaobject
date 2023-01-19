package com.confluxsys.demo.spring.dao;

import com.confluxsys.demo.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class CustomerDaoImpl implements CustomerDao{
    JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int createCustomer(Customer customer) {
        String query="INSERT INTO customer_order(name, email, mobile, orderItemsList)\n" +
                "VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(query, customer.getName(), customer.getEmail(), customer.getMobile(), customer.getOrderItemsList());
    }
}
