package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import work.Function;

class FunctionTest
{
	final double EPS = 1.0e-5;
    private final Function cal = new Function();
	
	
	 @DisplayName("Test for function")
    @ParameterizedTest
    @ValueSource(doubles = {-1, -0.75, -0.5, -0.25, 0, 0.25, 0.5, 0.75, 1})
	public void check_arccos(double x)
	{
		double actual = cal.getArcCos(x);
		double except = Math.acos(x);
		Assertions.assertEquals(actual, except, EPS);
	}

    @DisplayName("Test for exception")
    @ParameterizedTest
    @ValueSource(doubles = {2, -2})
    public void checkIllegalArguments(double x){
        assertThrows(IllegalArgumentException.class, ()->{cal.getArcCos(x);});
    }
}

