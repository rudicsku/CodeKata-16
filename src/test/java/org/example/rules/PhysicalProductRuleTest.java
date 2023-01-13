package org.example.rules;

import org.example.item.Payment;
import org.example.item.ProductType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PhysicalProductRuleTest {

    private PhysicalProductRule physicalProductRule;
    private Payment payment;

    @BeforeEach
    void setUp() {

        payment = new Payment(123, LocalDate.now(), ProductType.PHYSICAL_PRODUCT, 234.5, "Kis Pista");

        physicalProductRule = new PhysicalProductRule(payment);
    }

    @Test
    void executeRuleTest() {
        //Arrange &
        String expectedResult = "Dear Kis Pista,\n" +
                "\n" +
                "We are pleased to inform you that your order has been processed and is now on its way to you. We have included a packing slip with your shipment that lists the items that you have ordered.\n" +
                "Please take a moment to review the items and let us know if there are any discrepancies or if you have any further questions. We appreciate your business and look forward to serving you again in the future.\n" +
                "\n" +
                "Sincerely,\n" +
                "Rudolf Nemeth";

        //Act
        boolean resultBoolean = physicalProductRule.executeRule(payment);
        physicalProductRule.generatePackingSlip(resultBoolean, payment);

        //Assert
        assertEquals(expectedResult, payment.getPackingSlip());

    }
}