package GarbageCollection;
import java.util.*;
//Grabage Collection

public class Abce {
	 public static void main(String s[]) throws Exception { 
	    Runtime rs= Runtime.getRuntime(); 
	System.out.println("Free memory in JVMbefore Garbage Collection = "+rs.freeMemory());
	rs.gc(); System.out.println("Free memory in JVMafter Garbage Collection = "+rs.freeMemory()); } }

