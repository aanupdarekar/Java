import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String args[]){
		
		String test[] = {"10","63434","3423423","2342342"};
		List<Long> testList = new ArrayList<Long>();
		for (String long1 : test) {
			testList.add(Long.valueOf(long1));
		}
		long l = 63434;
		
		if(testList.contains(l)){
			
			System.out.println("Test Contains");
		}
		System.out.println("Test"+testList);
	}
}
