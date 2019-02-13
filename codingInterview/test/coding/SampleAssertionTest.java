package coding;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

import junit.framework.TestCase;

public class SampleAssertionTest extends TestCase {

	public void testAssertEquals()
	{
		assertEquals("test", "test");
		
	}
	public void testAssertEqual()
	{
		Comparator comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7,comp);
		Random rand = new Random();
		for(int i=0;i<7;i++){
			integerPriorityQueue.add(new Integer(rand.nextInt(100)));
		}
		for(int i=0;i<7;i++){
			Integer in = integerPriorityQueue.poll();
			System.out.println("Processing Integer:"+in);
		}
		
		
		
		
	}
}
