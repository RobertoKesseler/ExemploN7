package Kesseler.Roberto.Exemplo7;

import Kesseler.Roberto.Exemplo7.dao.ClientDAO;
import Kesseler.Roberto.Exemplo7.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Exemplo7Application {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo7Application.class, args);

		ApplicationContext applicationContext = SpringApplication.run(Exemplo7Application.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Roberto Kesseler"));

		System.out.println("objeto ClientDAO: " + clientDAO);
		System.out.println("objeto cliente: " + clientDAO.getClient());



	}

}
