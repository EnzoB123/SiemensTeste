public class Main {
	
	String foo = "Foo";
	String baa = "Baa";

	int count = 1;

	while (count <= 100) {

	    if (count % 3 == 0 && count % 5 == 0) {
	        System.out.println(foo+baa);
	    }
	    else if (count % 3 == 0) {
	    	System.out.println(foo);
	        }
	    else if (count % 5 == 0) {
	    	System.out.println(baa);
	    }
	    else {
	    	System.out.println(count);
	    }
	    count +=1;
	}
	
	public static void main (String[] args) {
		
	}
}
