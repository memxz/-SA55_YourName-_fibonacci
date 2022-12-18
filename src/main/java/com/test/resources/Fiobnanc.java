package com.test.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fiobnanc {
    
    public List<Integer> Fibonacci(int n)
	{
		List<Integer> list = new ArrayList<>();
		 int n_minus_1 = 1;
		 int n_minus_2 = 0;
		 int fib = 0;
		 
		 if (n == 0) {
		 list.add(0);
		 }
		 if (n == 1) {
			 list.add(1);
		 }
		 if(n>1) {
			 Collections.addAll(list, 0,1);
			 for (int i=2; i<=n; i++) {
				 fib = n_minus_1 + n_minus_2;
				 n_minus_2 = n_minus_1;
				 n_minus_1 = fib; 
				 list.add(fib);
			 }
		 }
		 return list; 
	}
	
	public List<Integer>sortList(List<Integer> list){
		Collections.reverse(list);
		int size=list.size();
		 List<Integer> numEven=new ArrayList<>();
		 List<Integer> numOld=new ArrayList<>();
		 for(int i=0; i<size;i++) {
			 int ele=list.get(i);
			
			 if(ele%2==0) {
				 numEven.add(ele); 
			 }
			 else
				 numOld.add(ele); 
		}
		 int n=numOld.size();
		 for(int i=0;i<n;i++){
			 numEven.add(numOld.get(i));	 
		 }
		 
		return numEven;
	}
}
