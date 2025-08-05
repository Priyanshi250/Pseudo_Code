package Pseudo_code_2;

public class Code_9 {
	    static int x=1;
	    public static void outer(){
	        int x=2;
	        inner(x);
	    }

	    public static void inner(int x){
	        System.out.println(x);
	    }
	    public static void main(String[] args) {
	        outer();
	    }
	}


