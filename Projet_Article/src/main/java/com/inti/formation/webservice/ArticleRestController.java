package com.inti.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.Imetier.IArticleMetier;

import com.inti.formation.model.Article;


@RestController
@RequestMapping(value="/apiArticle")
public class ArticleRestController {

	@Autowired
	private IArticleMetier metier;

	public IArticleMetier getMetier() {
		return metier;
	}

	public void setMetier(IArticleMetier metier) {
		this.metier = metier;
	}
	
	@RequestMapping(value="/ajouterA", method=RequestMethod.POST)
	public Article ajouter (@RequestBody Article a) {
		return metier.ajouter(a);
			}
	@RequestMapping(value="/updateA", method=RequestMethod.PUT)
	public Article update(@RequestBody Article a) {
		return metier.update(a);
	}
	
	@RequestMapping(value="deleteA/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")int id) {
		metier.delete(id);
	}
	@RequestMapping(value="/article/{id}",method=RequestMethod.GET)
	public Article findOne (@PathVariable("id")int id) {
		return metier.findOne(id);
	}
	
	@RequestMapping(value="/articles", method=RequestMethod.GET)
	public List<Article> findAll(){
		return metier.findAll();
	}
}
