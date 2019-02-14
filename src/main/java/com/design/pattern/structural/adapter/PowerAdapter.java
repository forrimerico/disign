package com.design.pattern.structural.adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();
    public int output() {
        int input = ac220.output();
        int output = input / 44;
        System.out.println("输出直流电5V");
        return output;
    }
}
