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
public class ParameterizedTestDiv {

	   //Test data generator for Division
       @Parameters(name = "Division #{index}: {1} : {2}= {0}")
       public static Collection<Integer[]> divdNumbers() {
      	   return Arrays.asList(new Integer[][] {
		  {5,10,2},{25,100,4},{25,50,2},{8,40,5}
	  										});}
       @Parameter(value = 0)
       public int expected_d;
       @Parameter(value = 1)
       public int first_d;
       @Parameter(value = 2)
       public int second_d;

       @Test
       public void div() {
    	   Calculator c=new Calculator();
       System.out.println(first_d+" : "+second_d+" = "+expected_d);
       assertEquals(expected_d, c.divNumbers(first_d, second_d)); }
       
}

