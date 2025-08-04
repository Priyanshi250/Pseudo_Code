package Pseudo_code;

public class Code_4 {
	    public static void fun(int x) {
	        if (x == 0) {
	            return;
	        }
	        fun(x - 1);
	        System.out.println(x);
	    }

	    public static void main(String[] args) {
	        fun(3);
	    }
	}


