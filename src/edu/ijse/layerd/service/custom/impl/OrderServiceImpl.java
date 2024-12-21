/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service.custom.impl;

import edu.ijse.layerd.dao.DaoFactory;
import edu.ijse.layerd.dao.custom.ItemDao;
import edu.ijse.layerd.dao.custom.OrderDao;
import edu.ijse.layerd.dao.custom.OrderDetailDao;
import edu.ijse.layerd.dto.OrderDto;
import edu.ijse.layerd.service.custom.OrderService;

/**
 *
 * @author anjan
 */
public class OrderServiceImpl implements OrderService{
    
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);
    private OrderDao orderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
    private OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER_DETAILS);

    @Override
    public String placeOrder(OrderDto orderDto) throws Exception {
        return null;
    }
    
}
