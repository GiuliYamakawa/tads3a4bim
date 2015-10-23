package br.univel.cdi;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped

public class ItemProcessor {

		@Inject
		 private ItemDAO itemDao;

		    public void execute() {
		        List<Item> items = itemDao.fetchItems();
		        for (Item item : items) {
		            System.out.println("Found item " + item);
		        }
		    }
	}
	

