/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.test.Sample;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author M1017259
 */
public class SampleJunitTest {
    
    public SampleJunitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testAddition() {
            
         Sample sample  = new Sample();
         assertEquals(25, sample.addition(10, 15));
     }
     
    @Test
    public void testSubtraction() {

        Sample sample = new Sample();
        assertEquals(10, sample.subtraction(20, 10));
    }
}
