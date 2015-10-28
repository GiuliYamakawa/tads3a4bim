package exercise2;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.univel.cdi.Item;
import br.univel.cdi.ItemDAO;

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
	

