package practice;

public class ForPractice {

		
	public boolean practice() {
		int[] array = {1,2,3,4};
		boolean bool;
		if(array[0] <= array[1]){
            for(int i=1; i > array.length;i++){
                if(array[i] > array[i+1]){
                    bool = false;
                } else{ bool = true; }
            }
        } else if (array[0] >= array[1]){
            for(int i = 1; i < array.length;i++){
                if(array[i] < array[i+1]){
                    bool = false;
                } else{bool = true;}
            }
        } return bool;}
}

