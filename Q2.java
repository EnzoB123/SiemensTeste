import java.util.Scanner;

public class Main {

	public static void FooBaa() {
	int count = 1;
	
	while (count <= 100) {

	    if (count % 3 == 0 && count % 5 == 0) {
	        System.out.println("FooBaa");
	    }
	    else if (count % 3 == 0) {
	    	System.out.println("Foo");
	        }
	    else if (count % 5 == 0) {
	    	System.out.println("Baa");
	    }
	    else {
	    	System.out.println(count);
	    }
	    count +=1;
	}
	
	}
	
	public static void main(String[] args) {
		FooBaa();
	}
	
}
