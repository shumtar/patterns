package iterpreterpattern.expression.expressionimpl;

import java.util.Map;

import iterpreterpattern.expression.Expression;

public class Number implements Expression {
	
	public int number;
	
	public Number(int number) {
		this.number = number;
	}
	@Override
	public int interpret(Map<String, Expression> variables) {
		return number;
	}

}
