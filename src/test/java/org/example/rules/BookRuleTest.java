package org.example.rules;

import org.example.item.Payment;
import org.example.item.ProductType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookRuleTest {

    private BookRule bookRule;
    private Payment payment;

    @BeforeEach
    void setUp() {

        payment = new Payment(123, LocalDate.now(), ProductType.BOOK, 234.5, "Nagy Bèla");

        bookRule = new BookRule();
    }

    @Test
    void executeRuleTest() {
        //Arrange &
        String expectedResult1 = "Dear Nagy Bèla,\n" +
                "\n" +
                "We are pleased to inform you that your order has been processed and is now on its way to you. We have included a packing slip with your shipment that lists the items that you have ordered.\n" +
                "Please take a moment to review the items and let us know if there are any discrepancies or if you have any further questions. We appreciate your business and look forward to serving you again in the future.\n" +
                "\n" +
                "Sincerely,\n" +
                "Rudolf Nemeth";

        String expectedResult2 = "Duplicated packing slip for Royalty Department";

        //Act
        boolean resultBoolean = bookRule.executeRule(payment);
        bookRule.generatePackingSlip(resultBoolean, payment);

        //Assert
        assertEquals(expectedResult1, payment.getPackingSlip());
        assertEquals(expectedResult2, payment.getPackingSlipForRoyalDepartment());

    }
}