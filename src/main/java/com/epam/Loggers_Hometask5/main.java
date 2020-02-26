package com.epam.Loggers_Hometask5;
import org.apache.log4j.Logger;
public class main {
	static Logger log = Logger.getLogger(Main.class.getName());
    public static void main( String[] args )
    {
    	Interest.calculateInterest();
        Construction.costEvaluator();
    }
}
