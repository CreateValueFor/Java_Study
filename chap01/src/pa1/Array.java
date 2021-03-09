package pa1;

public final class Array implements IArray {
    /*
     * Add some variables you will use.
     */
	int[] init_Array;
    int[] array;
    boolean bool = true;
    int left = 0;
    int right = array.length - 1;
    boolean found;
    int foundpos;
	int index;
	int[] copy_Array;

    
    
    public Array() {
        /*
         * Constructor 
         * This function is an initializer for this class.
         */
        
    }
    public void changeArray(int[] change) {
    	array = new int[change.length];
    	for(int i=0; i<array.length;) {
    		array[i] = change[i];
    	}
    }
    @Override
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
			boolean a = isSorted();
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
        this.array = array;}
    }



	@Override
    public void delete(int value) throws IllegalStateException {
        /*
         * Function input:
         *  + value: An integer to delete.
         * 
         * Job:
         *   Delete the first element that has the given integer as its value.
         *   If there is no such element, raise an exception.
         */
    	int a = search(value);
    	for(int i = a; i < array.length-1; i++) {
    		array[i] = array[i + 1];
    	}
    	array[array.length -1] = (Integer) null;
    	
    }

    @Override
    public int search(int value) throws IllegalStateException {
    	int notExist = -1;
    	for(int i = 0; i < array.length; i ++) {
    		
    		if(array[i] == value) {
    			index = i;
    			notExist = 0;
    			break;
    		}
    	}
    	if(notExist == -1) {
    		throw new IllegalStateException();
    	}
    	return index;
    }

    @Override
    public void sort() {
        /**
         * Function input: Nothing
         * 
         * Job:
         *  Change the state of the array to sorted.
         *  Sort the elements in the array in ascending order.
         */
        int min;
        int tmp;

		for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }

            }
            tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;        
        } 
    }

    @Override
    public void unsort() {
        /**
         * Function input: Nothing
         * 
         * Job:
         *  Change the state of the array to unsorted.
         */
    	array = init_Array;
    }

    @Override
    public int atIndex(int index) throws IndexOutOfBoundsException {
        /**
         * Function input:
         *  + index: An integer to find the element at that position
         * 
         * Job:
         *  Return the value of the element at the given index.
         */
    	int indexValue = array[index];
        return indexValue;
    }

    @Override
    public int size() {
        /*
        * Function input: Nothing
        *
        * Job:
        *  Return the number of elements in this array.
        */
    	int number = array.length;
        return number;
    }

    @Override
    public boolean isSorted() {
        /**
         * Function input: Nothing
         * 
         * Job:
         *  Return true if the array is sorted and false otherwise.
         */
    	if(size() < 2) {
    		return true;
    		
    	}
        if(array[0] <= array[1]){
        	for(int i=1; i < array.length; i++){
        		if(array[i] > array[i+1]){
        			bool = false;
        			break;
        		}

        	}
        } else if (array[0] >= array[1]){
        	for(int i = 1; i < array.length; i++){
        		if(array[i] < array[i+1]){
        			bool = false;
        			break;
                }
            }
        }
        return bool;

    }

    @Override
    public boolean isEmpty() {
        /* You do not have to edit this function. */
        return size() == 0;
    }
}

