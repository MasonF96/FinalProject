
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class Order {
    private final Date date;
    private int orderNumber;
    private int customerNumber;

    public Order(int orderNumber, Date date, double amount, int customerNumber) {
        this.orderNumber = orderNumber;
        this.date = date;
        this.customerNumber = customerNumber;
    }

    public int getcustomerNumber() {
        return customerNumber;
    }

    public void setcustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Date getDate() {
        return date;
    }

    public int getorderNumber() {
        return orderNumber;
    }

    public void setorderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNumber=" + orderNumber + ", date=" + date + ", customerNumber=" + customerNumber + '}';
    }
}
