package MultiThreading;

import java.io.IOException;
import java.util.regex.Pattern;

public class M_T1 extends Thread{

	public void run(){  
		System.out.println("thread is running...");  
		}  
	public void run1(){  
		System.out.println("thread is running...");  
		} 
		public static void main(String args[]){ 
			 try {
			/*	Runtime.getRuntime().exec("notepad");
				System.out.println(Runtime.getRuntime().availableProcessors()); 
				 Runtime r=Runtime.getRuntime();  
				  System.out.println("Total Memory: "+r.totalMemory());  
				  System.out.println("Free Memory: "+r.freeMemory()); */ 
				 System.out.println(Pattern.matches("[amn]?", "a"));
				 System.out.println();
				String s="ggh2gh43uu";
				System.out.println(s.replaceAll(".\\D[0-9]", ""));
				 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			M_T1 t1=new M_T1();  
		t1.start();  
		t1.start();  
		 }  

}
