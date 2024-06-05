package br.com.prefeitura.diadema;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.com.prefeitura.diadema.vre.VreService;

//@SpringBootApplication(
@SpringBootApplication(exclude={SecurityAutoConfiguration.class}) //desbiiltar a segurança
//@SpringBootApplication(exclude={SecurityConfiguration.class}) //desbiiltar a segurança

public class DiademaApplication extends SpringBootServletInitializer{

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DiademaApplication.class, args);
	}

	/*
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        super.configure(application);
        return application;
    }*/

//	private VreService outraClasse;
	
	/*@Autowired
    public DiademaApplication(VreService outraClasse) {
        this.outraClasse = outraClasse;
    }*/
	
	
	/*@Autowired	 
	    public void run() throws Exception {
	       
		//startHourlyTimer();
	    }
	*/
	/* private void startHourlyTimer() {
	        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	       

	        // Defina a tarefa que será executada a cada hora
	        Runnable task = new Runnable() {
	            @Override
	            public void run() {
	                // Coloque aqui o código que você quer executar a cada hora
	            	outraClasse.executar();
	            }
	        };

	        // Agende a tarefa para ser executada a cada hora
	        scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.MINUTES);
	    }
*/
}
