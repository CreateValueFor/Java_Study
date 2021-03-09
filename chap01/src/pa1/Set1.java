package pa1;

public final class Set1 implements ISet {
    /*
     * Add some variables you will use.
     */

    public Set() {
        /*
         * Constructor 
         * This function is an initializer for this class.
         */
    	
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
    }

    @Override
    public void union(ISet set) {
        /**
         * Function input:
         *  + set: A set to be unioned
         * 
         * Job:
         *  Union the other set to this set
         */
    }

    @Override
    public void intersection(ISet set) {
        /**
         * Function input:
         *  + set: A set to be intersectioned
         * 
         * Job:
         *  Intersect the other set to this set
         */
    }

    @Override
    public void subtraction(ISet set) {
        /**
         * Function input:
         *  + set: A set to be subtracted
         * 
         * Job:
         *  Subtract the other set from this set
         */
    }

    @Override
    public int[] show() {
        /**
         * Function input: Nothing
         * 
         * Job:
         *  Return the elements of the set as an array.
         */
        return new int[] {};
    }
}
