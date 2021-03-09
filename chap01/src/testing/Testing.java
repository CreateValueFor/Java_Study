package testing;

public class Testing {

	int[] array = {1,2,3,4,5,6,7,8,9,10};
	int[] copy_Array = new int[array.length+ 1];
	int value = 5;
	boolean a = true;
	{
	
    if(a == true) {
    	for(int i = 0, j = i+1; i< array.length; i++) {
    		if(array[i] <= value && array[j] >= value) {
    			for(int k = 0; k < i; k++) {
    				copy_Array[k] = array[k];
    			}
    			copy_Array[i] = value;
    			for(int k = i + 1; k < copy_Array.length; k ++) {
    				copy_Array[k] = array[k];
    			}
    		}
    	}
    } else {

    	for(int i = 0; i < array.length; i++) {
    		copy_Array[i] = array[i];
    	copy_Array[array.length] = value;
    	}
    }
    array = copy_Array;
}}
