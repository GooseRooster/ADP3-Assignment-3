package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    String[] subjects = {"ADP3", "ADT3", "ICE3", "ITS3", "PFP3", "PRM3", "PRP3", "PRT3"};
    int[] marks = {75, 75, 70, 65, 75, 60, 70, 65};

    @Test
    public void calculateAverage() {
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        Assert.assertEquals(69.375, total/8, 0.02);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
