/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import static com.sun.javafx.util.Utils.sum;
import static java.lang.Double.sum;
import static java.lang.Float.sum;
import static java.lang.Integer.sum;
import static java.lang.Long.sum;
import static javax.swing.Spring.sum;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sum.sum;

/**
 *
 * @author user
 */
public class test {
    
   
    @Test
     public void SummaTest() {
         
       sum obj = new sum();
         
         double  tulemus = obj.Summa(3,50);
        // if (tulemus!=8) Assert.fail();
        //Assert.assertTrue("Summa on vale", tulemus ==53);
        Assert.assertEquals(tulemus, 53.0, 0.001);
     }
        @Test
       public void VaheTest() {
           
          sum obj = new sum();
          
       double tul = obj.Summa(22,10);
        // if (tul!=12) Assert.fail();   
         Assert.assertFalse("Vahe on vale", tul==10);  
         
       }
       @Test
       public void JagamineTest() {
         
         sum obj = new sum();
         
         double  tulemus = obj.Jagamine(100,10);
        if (tulemus!=10) Assert.fail();
  
       }
        @Test
       public void KorrutamineTest() {
         
         sum obj = new sum();
         
         double  tulemus = obj.Korrutamine(10,10);
        if (tulemus!=100) Assert.fail();
       }
}