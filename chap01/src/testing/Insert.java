package testing;

public class Insert {
    int[] array = {999999999};
    int[] copy_Array;
    int a = 0;
    String b = "aaaaa"; 
	
	
	public void insert(int value) {
        /*
         * Function input:
         *  + value: An integer to be inserted.
         * 
         * Job:
         *  Insert the given integer according to the state of the array.
         *  - unsorted: insert the integer as the last element of the array.
         *  - sorted: insert the integer at the position that makes the array sorted in ascending order.
         */
		if(array[0] == 999999999) {
			array[0] = value;
		} else if(array.length == 1){
			copy_Array = new int[array.length + 1];
			if(array[0] > value) {
				copy_Array[0] = value;
				copy_Array[1] = array[0];
				this.array = copy_Array;
			}else {
				copy_Array[0] = array[0];
				copy_Array[1] = value;
				this.array = copy_Array;
			}
		}else{
			copy_Array = new int[array.length + 1];
			boolean a = true;
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
			int[] array = new int[copy_Array.length];
			for(int i = 0; i < copy_Array.length; i++) {
				array[i] = copy_Array[i];
			}
        this.array = array;
    }


}}
