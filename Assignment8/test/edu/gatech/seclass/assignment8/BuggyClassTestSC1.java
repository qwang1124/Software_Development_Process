package edu.gatech.seclass.assignment8;

import edu.gatech.seclass.assignment8.BuggyClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ammilkov on 7/2/15.
 */
public class BuggyClassTestSC1 {

    @Test
    public void testMethod1() throws Exception {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.method1(3);
        buggyClass.method1(2);
    }
}