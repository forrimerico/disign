package com.design.principle.openclose;

/**
 * 对JavaCourse类的扩展
 * 当有一个新需求提出，需要对课程价格进行打折，我们尽量不对原来的接口进行修改
 * 而是在其基础上进行扩展编写
 * 遵守开闭原则，降低程序出bug的风险，提高可维护性
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice()
    {
        return super.getPrice()*0.8;
    }

    public Double getOriginalPrice()
    {
        return super.getPrice();
    }
}
