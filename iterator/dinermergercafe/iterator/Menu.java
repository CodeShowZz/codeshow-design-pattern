package headfirst.designpatterns.iterator.dinermergercafe.iterator;

import java.util.Iterator;

import headfirst.designpatterns.iterator.dinermergercafe.model.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
