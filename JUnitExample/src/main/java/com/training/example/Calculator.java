package com.training.example;

public class Calculator {

	public int sum(int x,int y) {
		return x+y;
	}
	public int sub(int x,int y) {
		if(x>y)
			return x-y;
		else
			return y-x;
	}
	public int mul(int x,int y) {
		return x*y;
	}
	public int div(int x,int y) {
		return x/y;
	}
	
	public double avg(int x, int y, int z) throws AvgNegValueException {
        if((x+y+z)<0) {
            throw new AvgNegValueException("avg is less than zero");
        }
        return (x+y+z)/3;
    }
}

