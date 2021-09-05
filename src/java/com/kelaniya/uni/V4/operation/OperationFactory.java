package com.kelaniya.uni.V4.operation;

//Factory design pattern
public class OperationFactory {

    public Operation getInstance(String operator) {

        Operation operation = null;
        if (operator.equals("add")) {
            operation = new AddOperation();
        } else if (operator.equals("sub")) {
            operation = new SubOperation();
        } else if (operator.equals("mul")) {
            operation = new MulOperation();
        }

        return operation;

    }

}
