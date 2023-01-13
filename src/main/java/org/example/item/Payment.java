package org.example.item;


import java.time.LocalDate;

public class Payment {

    private final int paymentId;
    private final LocalDate paymentDate;
    private final ProductType productTypeOfPayment;
    private final double totalCost;
    private final String customerName;
    private String packingSlip;
    private String packingSlipForRoyalDepartment;


    public Payment(int paymentId, LocalDate paymentDate, ProductType productTypeOfPayment, double totalCost, String customerName) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.productTypeOfPayment = productTypeOfPayment;
        this.totalCost = totalCost;
        this.customerName = customerName;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public ProductType getProductTypeOfPayment() {
        return productTypeOfPayment;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setPackingSlip(String packingSlip) {
        this.packingSlip = packingSlip;
    }

    public void setPackingSlipForRoyalDepartment(String packingSlipForRoyalDepartment) {
        this.packingSlipForRoyalDepartment = packingSlipForRoyalDepartment;
    }

    public String getPackingSlip() {
        return packingSlip;
    }

    public String getPackingSlipForRoyalDepartment() {
        return packingSlipForRoyalDepartment;
    }
}
