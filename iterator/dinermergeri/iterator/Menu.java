package headfirst.designpatterns.iterator.dinermergeri.iterator;

import java.util.Iterator;

import headfirst.designpatterns.iterator.dinermergeri.model.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
