package com.zuehlke.cleancodeworkshop.removeduplications;

import com.zuehlke.cleancodeworkshop.removeduplication.MathUtils;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@DisplayName("isDivisibleBy3")
public class MathUtilsIsDivisibleBy3Test {

    @Test
    @DisplayName("returns true")
    public void testIsDivisibleBy3_Given_FactorsOf_3() {
        assertTrue(MathUtils.isDivisibleBy3(3));
        assertTrue(MathUtils.isDivisibleBy3(6));
        assertTrue(MathUtils.isDivisibleBy3(9));
        assertTrue(MathUtils.isDivisibleBy3(15));
        assertTrue(MathUtils.isDivisibleBy3(30));
    }

    @Test
    public void testIsDivisibleBy3_Given_Negative_FactorsOf_3() {
        assertTrue(MathUtils.isDivisibleBy3(-3));
        assertTrue(MathUtils.isDivisibleBy3(-6));
        assertTrue(MathUtils.isDivisibleBy3(-9));
        assertTrue(MathUtils.isDivisibleBy3(-15));
        assertTrue(MathUtils.isDivisibleBy3(-30));
    }

    @Test
    public void testIsDivisibleBy3_Given_FailingInputs() {
        assertFalse(MathUtils.isDivisibleBy3(2));
        assertFalse(MathUtils.isDivisibleBy3(4));
        assertFalse(MathUtils.isDivisibleBy3(10));
    }

    @Test
    public void testIsDivisibleBy3_Given_SpecialInputs() {
        // 0 is dividable by every number
        assertTrue(MathUtils.isDivisibleBy3(0));
        // 1 isn't dividable by any number exept 1 itself
        assertFalse(MathUtils.isDivisibleBy3(1));
    }


}
