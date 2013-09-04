package iterpreterpattern.expression.expressionimpl;

import java.util.Map;

import iterpreterpattern.expression.Expression;

public class Minus implements Expression {

	Expression leftExpression;
	Expression rightExpression;
	
	
	public Minus(Expression left, Expression right) {
		this.leftExpression = left;
		this.rightExpression = right;
	}
	
	@Override
	public int interpret(Map<String, Expression> variables) {
		return leftExpression.interpret(variables)-rightExpression.interpret(variables);
	}

}
