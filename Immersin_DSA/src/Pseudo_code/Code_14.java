package Pseudo_code;

public class Code_14 {
	    public static int pro(int n){
	        if(n == 0) {
	            return 1;
	        }
	        return (n%10) * pro(n / 10);
	    }
	    public static void main(String[] args) {
	        System.out.println(pro(123));
	    }
	}


