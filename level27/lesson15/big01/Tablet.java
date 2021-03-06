package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Order;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Vladimir on 10.04.2015.
 */
public class Tablet
{
    public final int number;
    public static Logger logger = Logger.getLogger(Tablet.class.getName());
    public Tablet(int number)
    {
        this.number = number;
    }
    public void createOrder(){
        try
        {
            Order order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());
        }
        catch (IOException e)
        {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
    }
    @Override
    public String toString()
    {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}