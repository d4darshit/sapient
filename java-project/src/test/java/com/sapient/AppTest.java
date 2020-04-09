package com.sapient;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */


    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    CheckEven ch = new CheckEven();
    public void testApp()
    {   
        assertTrue( ch.check(0)==true);
        assertTrue(ch.check(1)==false);

    }

    public void checkEven()
    {
        assertTrue(ch.check(2)==true);
    }
    
}