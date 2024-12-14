/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.controller;

import edu.ijse.layerd.dto.CustomerDto;
import edu.ijse.layerd.service.ServiceFactory;
import edu.ijse.layerd.service.custom.CustomerService;

/**
 *
 * @author anjan
 */
public class CustomerController {
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    public CustomerDto searchCustomer(String id) throws Exception{
        return customerService.search(id);
    }
}
