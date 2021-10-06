package com.techstudy.misc.collection;

import java.util.ArrayList;
import java.util.List;

public class StorageFactory {  //singleton

	int max_capacity = 4500000;
	List<Vaccine> vlist = new ArrayList<>();
	
	private StorageFactory() {}
}
