package javaprojects.polymorphism;

import java.awt.*;


interface X
{

    void methodX();

    interface Y
    {
        void methodY();
    }
}

class Z implements X, X.Y
{
    {
        methodX();

        System.out.println(1);
    }

    public void methodX()
    {

        methodY();

        System.out.println(2);
    }

    public void methodY()
    {
        System.out.println(3);
    }
}


class MainClass
{
    public static void main(String[] args)
    {
        Z z = new Z();

        z.methodX();

        z.methodY();

        X x = z;

        x.methodX();

    }
}