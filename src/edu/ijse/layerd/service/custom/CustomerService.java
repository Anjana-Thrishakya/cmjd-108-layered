/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;

import edu.ijse.layerd.dto.CustomerDto;
import edu.ijse.layerd.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public interface CustomerService extends SuperService{
    public String save(CustomerDto customerDto) throws Exception;
    public String update(CustomerDto customerDto) throws Exception;
    public String delete(String customerId) throws Exception;
    public CustomerDto search(String customerId) throws Exception;
    public ArrayList<CustomerDto> getAll() throws Exception;
    
}
