package oop.d251120.oop2_homework3;

import java.util.Date;

public class Visit {
  private Customer customer;
  private Date date;
  private double serviceExpense;
  private double productExpense;

  public Visit(String name, Date date) {
    // TODO Auto-generated constructor stub
    this.customer = new Customer(name);
    this.date = date;
  }

  public String getName() {
    return customer.getName();
  }

  public double getServiceExpense() {
    return serviceExpense;
  }

  public void setServiceExpense(double serviceExpense) {
    this.serviceExpense = serviceExpense;
  }

  public double getProductExpense() {
    return productExpense;
  }

  public void setProductExpense(double productExpense) {
    this.productExpense = productExpense;
  }

  public double getTotalExpense() {
    // TODO Auto-generated method stub
    return serviceExpense + productExpense;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }


}
