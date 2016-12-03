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
public class ParameterizedTestMul {

       
	   //Test data generator for Multiplication
       @Parameters(name = "Multiplication #{index}: {1} * {2}= {0}")
       public static Collection<Integer[]> muldNumbers() {
      	   return Arrays.asList(new Integer[][] {
		  {20,10,2},{44,11,4},{10,5,2},{70,14,5}
	  										});}
       @Parameter(value = 0)
       public int expected_m;
       @Parameter(value = 1)
       public int first_m;
       @Parameter(value = 2)
       public int second_m;

       @Test
       public void mul() {
    	   Calculator c=new Calculator();
       System.out.println(first_m+" * "+second_m+" = "+expected_m);
       assertEquals(expected_m, c.mulNumbers(first_m, second_m)); }
       
	 
       
}

