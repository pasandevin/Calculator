package com.kelaniya.uni.V2;

public class Main{

    public static void main(String[] args){

        // First validation to check if an cmd argument is provided
        if(args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return;
        }

        //Second validation 
        String operator = args[0];

        if(!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))){
            System.out.println("Please provide add, sub or mul as the operator argument");
            return;
        }

        System.out.println(args[0]);
    }

}