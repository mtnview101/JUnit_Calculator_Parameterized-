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
public class ParameterizedTestAdd {

	   //Test data generator for Addition
       @Parameters(name = "Addition #{index}: {1} + {2}= {0}")
       public static Collection<Integer[]> addedNumbers() {
      	   return Arrays.asList(new Integer[][] {
		  {3,1,2},{5,1,4},{7,5,2},{9,4,5}
	  										});}
       @Parameter(value = 0)
       public int expected;
       @Parameter(value = 1)
       public int first;
       @Parameter(value = 2)
       public int second;

       @Test
       public void sum() {
    	   Calculator c=new Calculator();
       System.out.println(first+" + "+second+" = "+expected);
       assertEquals(expected, c.addNumbers(first, second)); }
  
}

