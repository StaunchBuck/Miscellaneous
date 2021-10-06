package com.techstudy.misc.collection;

import java.util.ArrayList;
import java.util.List;

public class VaccineProducer implements Runnable{

	private StorageFactory factory ;
	
	public VaccineProducer(StorageFactory factory) {
		super();
		this.factory = factory;
		
		vaccines.add(new Vaccine());
		vaccines.add(new Vaccine());
		vaccines.add(new Vaccine());
		vaccines.add(new Vaccine());
	}
	int done = 0;
	List<Vaccine> vaccines = new ArrayList<>();
	

	@Override
	public void run() {
		synchronized(this.factory) {
			while(vaccines.size()>0) {
				if(done == 1) {
					done = 0;
					try {
						this.factory.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				boolean res = factory.vlist.add(vaccines.get(0));
				vaccines.remove(0);
				done++;
				notifyAll();
			}
			
		}
		
	}
	private void psvm() {
		// TODO Auto-generated method stub

	}
//	//map\.put(A,List<>)
//	vidited	 ->A, D,F
//	
//	A -> D E F
//	B -> C D G
//	C -> A E
//	D -> C F G
//	E -> D F
//	F -> C 
//	G
//	
//	String[][] matrix = new String[10][10];
//	matrix[A][C,D,E];
//	matrix[B][G,D,K];
	
	
	

}
