package com.func;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// TODO: make all code in this package (F, MyList, Main) work without
	// casting and compiler warnings
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("john");
		names.add("bob");
		MyList m1 = new MyList(names);
		F f1 = new F() {
			@Override
			public Object apply(Object arg) {
				return ((String) arg).length();
			}
		};
		MyList lengths = m1.map(f1);
		F f2 = new F() {

			@Override
			public Object apply(Object arg) {
				return arg.hashCode();
			}
		};
		MyList hashcodes = m1.map(f2);
		// make the following line work without casting
		// MyList<Number> hashcodes2 = m1.map(f2);

	}

}
