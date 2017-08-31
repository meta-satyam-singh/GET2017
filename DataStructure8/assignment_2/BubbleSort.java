package assignment_2;

public class BubbleSort 
{

	public int[] doBubbleSort(int[] array)
	{
		for(int outerLoopVariable = 0 ; outerLoopVariable < array.length ; ++outerLoopVariable)
		{
			for(int innerLoopVariable = outerLoopVariable + 1; innerLoopVariable < array.length ; ++innerLoopVariable)
			{
				if(array[innerLoopVariable] < array[outerLoopVariable])
				{

					swap(array , innerLoopVariable , outerLoopVariable);
				}
			}
		}
		
		return array;
	}

	public void swap(int[] array,int index1,int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}