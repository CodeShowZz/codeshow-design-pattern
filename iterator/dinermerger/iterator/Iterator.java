package headfirst.designpatterns.iterator.dinermerger.iterator;

import headfirst.designpatterns.iterator.dinermerger.model.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
