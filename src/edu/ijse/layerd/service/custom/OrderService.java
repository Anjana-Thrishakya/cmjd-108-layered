/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;

import edu.ijse.layerd.dto.OrderDto;
import edu.ijse.layerd.service.SuperService;

/**
 *
 * @author anjan
 */
public interface OrderService extends SuperService{
    String placeOrder(OrderDto orderDto) throws Exception;
}
