package fr.dauphine.ja.kiefferfloryan.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple PrimeCollection.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue( true );
    }
    
    public void test0IsPrime() {
    	PrimeCollection pc = new PrimeCollection();
    	assertFalse(pc.isPrime(0));
    }
    public void testTwoIsPrime() {
    	PrimeCollection pc = new PrimeCollection();
    	assertTrue(pc.isPrime(2));
    }
    public void test9IsPrime() {
    	PrimeCollection pc = new PrimeCollection();
    	assertFalse(pc.isPrime(9));
    }
}
