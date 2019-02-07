package com.design.pattern.creational.simplefactory;

public class SimpleFactory {
    public Vedio getVedio(Class c)
    {
        Vedio vedio = null;
        try {
            vedio = (Vedio) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return vedio;
    }
}
