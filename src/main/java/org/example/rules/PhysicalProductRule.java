package org.example.rules;

import org.example.item.Payment;
import org.example.item.ProductType;

public class PhysicalProductRule extends Rule {

    public PhysicalProductRule(Payment payment) {
        super("PhysicalProductRule", "If the payment is for a physical product, generate a packing slip for shipping.");
    }

    @Override
    public boolean executeRule(Payment payment) {
        return payment.getProductTypeOfPayment().equals(ProductType.PHYSICAL_PRODUCT);
    }

    public void generatePackingSlip(boolean b, Payment payment) {
        if (b) {
            String packingSlip = "Dear " + payment.getCustomerName() + ",\n" +
                    "\n" +
                    "We are pleased to inform you that your order has been processed and is now on its way to you. We have included a packing slip with your shipment that lists the items that you have ordered.\n" +
                    "Please take a moment to review the items and let us know if there are any discrepancies or if you have any further questions. We appreciate your business and look forward to serving you again in the future.\n" +
                    "\n" +
                    "Sincerely,\n" +
                    "Rudolf Nemeth";
            payment.setPackingSlip(packingSlip);
        }
    }
}
