package com.inti.formation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inti.formation.Imetier.IArticleMetier;
import com.inti.formation.model.Article;

@SpringBootApplication
public class ProjetArticleApplication implements CommandLineRunner {

	@Autowired
	private IArticleMetier metier;
	
    public static void main(String[] args) {
        SpringApplication.run(ProjetArticleApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Date d1 = new Date(2000, 1, 1);
		Date d2 = new Date(2019, 6, 6);
		Article a1=new Article(1, "sport", "coupe du monde feminin", "cnjsdcnsd", d1);
		Article a2 = new Article(2, "actu", "anniversaire débarquement", "cnjdsicbsd", d2);
	
		
//		metier.ajouter(a1);
	metier.ajouter(a2);
//	
//		a1.setUrl("sdfghjklm");
//		metier.update(a1);
		
//		metier.delete(2);
		
		
//		System.out.println(metier.findOne(1));
//		List<Article> articles=metier.findAll();
//		for (Article a: articles) {
//			System.out.println(a);
//		}
	}

}