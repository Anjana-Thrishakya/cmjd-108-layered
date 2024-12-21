/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.entity;

/**
 *
 * @author anjan
 */
public class OrderDetailEntity {
    private String orderId;
    private String itemCode;
    private int qty;
    private double disount;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String orderId, String itemCode, int qty, double disount) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.disount = disount;
    }

    
    
    @Override
    public String toString() {
        return "OrderDetailEntity{" + "orderId=" + getOrderId() + ", itemCode=" + getItemCode() + ", qty=" + getQty() + ", disount=" + getDisount() + '}';
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the disount
     */
    public double getDisount() {
        return disount;
    }

    /**
     * @param disount the disount to set
     */
    public void setDisount(double disount) {
        this.disount = disount;
    }
   
    
}
