package core;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTestSub {

  
	   //Test data generator for Subtraction
       @Parameters(name = "Subtraction #{index}: {1} - {2}= {0}")
       public static Collection<Integer[]> subdNumbers() {
      	   return Arrays.asList(new Integer[][] {
      		 {8,10,2},{7,11,4},{3,5,2},{9,14,5}
	  										});}
       @Parameter(value = 0)
       public int expected_s;
       @Parameter(value = 1)
       public int first_s;
       @Parameter(value = 2)
       public int second_s;

       @Test
       public void sub() {
    	   Calculator c=new Calculator();
       System.out.println(first_s+" - "+second_s+" = "+expected_s);
       assertEquals(expected_s, c.subNumbers(first_s, second_s)); }
       

       
}

