package sudokugame;


import java.util.*;
import java.util.Random;

class SudokuLogic1 {
    public int size;
    public int[][] layout;
    public String[][] elements;

    // Random element generator to fill the layout
   private final Random rand = new Random();
   public int randomElementGenerator() {
       // uniform 1…size
     return rand.nextInt(this.size) + 1;
   }
  
    // Check in the row
    public boolean checkRow(int row, int randomElement) {
        for (int k = 0; k < size; k++){
        	if (layout[row][k] == randomElement) {
                return false; 
            	}
        }
        return true;
    }

    // Check in the columns
    public boolean checkColumn(int column, int randomElement) {
        for (int k = 0; k < size; k++) {
            if (layout[k][column] == randomElement) {
                return false; 
            }
        }
        return true;
    }

    // Filling the layout
    public boolean fillLayout() {
    	int retry = 0;
        int possibleElement = 0;
        resetLayout();
       for (int row = 0; row < size; row++) {

            for (int column = 0; column < size; column++) {
            	retry = 0;
                boolean present = false;
               while (present != true && retry < 100) {
                	possibleElement = this.randomElementGenerator();
                    present = (this.checkRow(row, possibleElement) && this.checkColumn(column, possibleElement));
                    if(retry > 90){break ;}
                   retry = retry + 1;
                  }

              	if(retry > 90)return false;
                 retry = 0;
               while (!present && retry < 100) {
                  possibleElement = this.randomElementGenerator();
                  present = checkRow(row, possibleElement)
                         && checkColumn(column, possibleElement);
                  retry++;
             }
               // if we never found a valid number in 100 tries, restart the grid
               if (!present) return false;
                layout[row][column] = possibleElement; 
            }
            }

        return true;
    }
      
    //Reset the layout
    public void resetLayout(){
    	layout = new int[size][size];
    }

    //Constructor
    SudokuLogic1(int size) {
    	int count = 0;
        this.size = size;
        //layout = new String[size][size];
        boolean checkedValidity = false;
        while(!checkedValidity){
        checkedValidity = this.fillLayout();
        count++;
        }

        createElement();
       
    }
    
		

	//Creating the blank spaces
	public String[][] createElement(){
	elements = new String[size][size];
		int count = 0;
		for(int i = 0; i < size; i++){
		for(int j = 0; j < size; j++){
				int random = (int)(System.nanoTime() % size);
				if((random == i) || (random == j)){
				elements[i][j] = String.format("%s",Integer.toString(layout[i][j]));
				count++;
				}else{
					elements[i][j] = String.format("%s","");
				count++;
				}
			} 
		}
		return elements;
	}
	
	


			 	

public boolean checkingCorrect(String[][] elements) {
    
    for (int i = 0; i < size; i++) {
        boolean[] seen = new boolean[size + 1]; 
        for (int j = 0; j < size; j++) {
            int num = Integer.parseInt(elements[i][j]);
            
            if (num < 1 || num > size || seen[num]) {
                return false;
            }
            seen[num] = true;
        }
    }
    
   
    for (int j = 0; j < size; j++) {
        boolean[] seen = new boolean[size + 1]; 
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(elements[i][j]);
            if (num < 1 || num > size || seen[num]) {
                return false;
            }
            seen[num] = true;
        }
    }
    return true;
}


}