package com.professorangoti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.professorangoti.di.v3.injecaodedependencia.BotaoLigaDesliga;
import com.professorangoti.di.v3.injecaodedependencia.DispositivoEletrico;
import com.professorangoti.di.v3.injecaodedependencia.Lampada;
import com.professorangoti.orm.Categoria;
import com.professorangoti.orm.CategoriaRepository;

@SpringBootApplication
public class TesteSpringbootHibernateApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository repo;
	
	@Autowired
	Lampada lampada;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteSpringbootHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//repo.save(new Categoria(null,"teste"));
		BotaoLigaDesliga botaoLigaDesliga = new BotaoLigaDesliga(lampada);
		botaoLigaDesliga.pressionar();
		botaoLigaDesliga.pressionar();
	}

}
