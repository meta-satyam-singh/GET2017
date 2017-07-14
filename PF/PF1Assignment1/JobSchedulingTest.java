
import static org.junit.Assert.*;

import org.junit.Test;

public class JobSchedulingTest {

	@Test
	public void validInputCheck() {
		int[] arrival_time = {1,5,9,25};
		int[] job_size = {12,7,2,5};
		int result[][] = JobScheduling.calculateWaitingTime(arrival_time, job_size);
		int[][] expected = {{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void sameArrivalTime() {
		int[] arrival_time = {1,1,1,1};
		int[] job_size = {12,7,2,5};
		int result[][] = JobScheduling.calculateWaitingTime(arrival_time, job_size);
		int[][] expected = {{1,1,0,1,12},{2,1,12,13,19},{3,1,19,20,21},{4,1,21,22,26}};
		assertArrayEquals(expected,result);
	}

}
