package pa1;

public final class Set implements ISet{
    
	int[] set1 = {999999};
	Array change = new Array();

	int[] new_set;
	int check = -1;

	public Set() {
        /*
         * Constructor 
         * This function is an initializer for this class.
         */
    }
	public int Check(int value) {
		
		for(int i = 0; i< set1.length;i++) {
			if(set1[i] == value) {
				check = 0;
			}
		}
		return check;
	}
    @Override
    public void insert(int value) {
        /*
         * Function input:
         *  + value: An integer to be inserted.
         * 
         * Job:
         *  Insert the integer if it does not exist.
         */
    	change.changeArray(set1);
    	if(set1[0] == 999999) {
    		set1[0] = value;
    	} else {
    		int a = Check(value);
    		//if a changed to -1, then set has any same value.
    		if(a == -1) {
    			new_set = new int[set1.length + 1];
    			for(int i = 0; i<set1.length; i++) {
    				new_set[i] = set1[i];
    			}
    			new_set[set1.length] = value;
    			this.set1 = new_set;
    	}}
    }

    @Override
    public void delete(int value) throws IllegalStateException {
        /**
         * Function input:
         *  + value: An integer to be deleted
         * 
         * Job:
         *  Delete the integer from the set.
         *  Raise an exception if it does not exist.
         */
    	int check_Value = Check(value);
    	if(check_Value == -1) {
    		throw new IllegalStateException();
    	}else if (check_Value == 0) {
    		for(int i = 0; i < set1.length;i++) {
    			if(set1[i] == value) {
    				set1[i] =(Integer) null;
    			}
    		}}
    	}
    

//    @Override
//    public void union(ISet set) {
//        /**
//         * Function input:
//         *  + set: A set to be unioned
//         * 
//         * Job:
//         *  Union the other set to this set
//         */
//    
//
//    @Override
//    public void intersection(ISet set) {
//        /**
//         * Function input:
//         *  + set: A set to be intersectioned
//         * 
//         * Job:
//         *  Intersect the other set to this set
//         */
//    }
//
//    @Override
//    public void subtraction(ISet set) {
//        /**
//         * Function input:
//         *  + set: A set to be subtracted
//         * 
//         * Job:
//         *  Subtract the other set from this set
//         */
//    }
//
//    @Override
//    public int[] show() {
//        /**
//         * Function input: Nothing
//         * 
//         * Job:
//         *  Return the elements of the set as an array.
//         */
//        return new int[] {};
//    }
}



