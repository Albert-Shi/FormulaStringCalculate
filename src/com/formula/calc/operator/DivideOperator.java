package com.formula.calc.operator;

/**
 * @author shishuheng
 * @date 2020/1/21 2:33 下午
 */
public class DivideOperator extends Operator {
    DivideOperator(Integer id, String value, Integer factor) {
        super(id, value, factor);
    }

    @Override
    public double operate(double a, double b) {
        return a / b;
    }
}
