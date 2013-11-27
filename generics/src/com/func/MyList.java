package com.func;

import java.util.ArrayList;
import java.util.List;

// TODO: introduce generics
public class MyList {
	// encapsulated list
	private List list;
	public List getList() {
		return list;
	}
	public MyList(List list) {
		this.list = list;
	}
	/**
	 * Invokes the supplied function on all the elements and returns a MyList
	 * with the results.
	 * @param f
	 * @return
	 */
	public MyList map(F f) {
		List results = new ArrayList();
		for(Object o : list) {
			results.add(f.apply(o));
		}
		return new MyList(results);
	}

}
