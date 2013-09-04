package iterpreterpattern.expression.expressionimpl;

import java.util.Map;

import iterpreterpattern.expression.Expression;

public class Plus implements Expression {

	Expression leftExpression;
	Expression rightExpression;
	
	
	public Plus(Expression left, Expression right) {
		this.leftExpression = left;
		this.rightExpression = right;
	}
	
	@Override
	public int interpret(Map<String, Expression> variables) {
		return leftExpression.interpret(variables)+rightExpression.interpret(variables);
	}

}
