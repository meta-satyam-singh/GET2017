package pf4;
import java.util.ArrayList;
import java.util.List;
public class TowerOfHanoi 
{
	//this method takes the number of disks and rods name and output the list array of steps
	private  List<String> mainTowerOfHanoi(String source,  String temp, String destination, int numOfDisk, List<String> result, int totalNoOfDisk) {
		//it checks if there is only one disk and directly move the disks
		if(numOfDisk == totalNoOfDisk)
		{		
			result.add( "Move Disk "+ numOfDisk +" from "+ source +" to "+ destination );
			return result;
		} 
		//recursive calls are made to move the disks and store the output in an array list
		else 
		{				
			mainTowerOfHanoi( source, destination, temp, numOfDisk, result, totalNoOfDisk+1 );
			result.add("Move Disk "+ totalNoOfDisk +" from "+ source +" to "+ destination);
			mainTowerOfHanoi(temp, source, destination, numOfDisk, result, totalNoOfDisk+1);
		}
		return result;
	}	
	public  List<String> towerOfHanoi(String source, String destination, String temp, int numOfDisk)
	{
		List<String> output = new ArrayList<String>();
		int totalNoOfDisk = 1;
		mainTowerOfHanoi(source, temp, destination, numOfDisk, output, totalNoOfDisk);
		for(String string : output){
			System.out.println(string);
		}
		return output;
	}
}