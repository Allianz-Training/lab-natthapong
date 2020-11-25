package oop.d251120.oop2_homework3;

public class DiscountRate {
  private double serviceDiscountPremium = 0.2;
  private double serviceDiscountGold = 0.15;
  private double serviceDiscountSilver = 0.1;
  private double productDiscountPremium = 0.1;
  private double productDiscountGold = 0.1;
  private double productDiscountSilver = 0.1;

  public double getServiceDiscountRate(String type) {
    if (type == "Premium") {
      return serviceDiscountPremium;
    } else if (type == "Gold") {
      return serviceDiscountGold;
    } else if (type == "Silver") {
      return serviceDiscountSilver;
    } else {
      System.out.println("Service type not found!");
      return 0;
    }
  }

  public double getProductDiscountRate(String type) {
    if (type == "Premium") {
      return productDiscountPremium;
    } else if (type == "Gold") {
      return productDiscountGold;
    } else if (type == "Silver") {
      return productDiscountSilver;
    } else {
      System.out.println("Product type not found!");
      return 0;
    }
  }
}
