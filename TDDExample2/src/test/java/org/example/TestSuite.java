// B211202062 BUĞRA KAAN KESMEZ
// SOFTWARE VERİFİCATİON AND VALİDATİON , CREATİNG PARAMETERİZED TESTİNG USİNG JUNİT
// https://github.com/BKaanKesmez/Software-Verification-and-Validation

package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestSuite {
    private float a;
    private float b;
    private float expected;

    public TestSuite(float a, float b, float expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name= "TestDivision: ({0} / {1}) = {2}")
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {10.0f, 2.0f, 5.0f},
                {10.0f, 4.0f, 2.5f},
                {12.5f, 2.5f, 5.0f},
                {10.0f, 2.5f, 4.0f},
                {12.5f, 5.0f, 2.5f}

        });
    }

    @Test
    public void testDivision() {
        assertEquals(expected, Calculator.divide(a, b), 0.0001);
    }
}
