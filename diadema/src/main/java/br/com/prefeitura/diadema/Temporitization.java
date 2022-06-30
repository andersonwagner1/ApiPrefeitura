package br.com.prefeitura.diadema;

import java.util.Timer;
import java.util.TimerTask;

public class Temporitization {
	
	
	public static void run(Integer minute) {
		 int delay = 0;   // delay de 0 seg.
	        int interval = 1000 * 60 * minute;        
	        Timer timer2 = new Timer();
	        timer2.scheduleAtFixedRate(new TimerTask() {
	                public void run() {
	                    System.out.println("Olá World no console");
	                }
	            }, delay, interval);
	}
}
