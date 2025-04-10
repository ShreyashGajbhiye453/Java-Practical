import java.util.Scanner;
class SudokuGame {
    public int size;
    public int[][] layout;
    public String[][] elements;

    // Random element generator to fill the layout
   public int randomElementGenerator() { 
    return (int)(System.nanoTime() % this.size )+ 1;
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
    SudokuGame(int size, int length) {
    	int count = 0;
        this.size = size;
        //layout = new String[size][size];
        boolean checkedValidity = false;
        while(!checkedValidity){
        checkedValidity = this.fillLayout();
        count++;
        }
        
        System.out.println(this.gridPrinting(size, length));
        System.out.println("Give the solution for this sudoku question:");
        this.solveSudoku(size, length);
       
    }
    
    //Printing the final sudoku
    public String gridPrinting(int size, int length){
    String[][] element = crerateElement(size, length);
		int layout = 2*size + 1;
		String pattern = "";
		for(int i = 1; i <= layout; i++){
			for(int j = 1; j <= layout; j++){
				if((i % 2 == 1) && (j % 2 == 0)){
					for(int k = 1; k <= length; k++){
						pattern = pattern + "-";
					}
					}else if((i % 2 == 1) && (j % 2 == 1)){
						pattern = pattern + "+";
					}else if((i % 2 == 0) && (j % 2 == 1)){
						pattern = pattern + "|";
						}else if((i % 2 == 0) && (j % 2 == 0)){
						  
						int k1 = (i - 1)/2;
						int k2 =  (j - 1)/2;
						if((k1 < size) && (k2 < size)){
							pattern = pattern + element[k1][k2];
					
						}
					}
				}
			pattern = pattern + "\n";
		}
		return pattern;
			
}		

	//Creating the blank spaces
	public String[][] crerateElement(int size, int length){
	elements = new String[size][size];
		int count = 0;
		for(int i = 0; i < size; i++){
		for(int j = 0; j < size; j++){
				int random = (int)(System.nanoTime() % size);
				if((random == i) || (random == j)){
				elements[i][j] = String.format("%" + length + "s",Integer.toString(layout[i][j]));
				count++;
				}else{
					elements[i][j] = String.format("%" + length + "s","");
				count++;
				}
			} 
		}
		return elements;
	}
	
	
    	//Solving the SUDOKU
	public void solveSudoku(int size, int length) {
    Scanner scanner = new Scanner(System.in);
    // Prompt user to fill the blank elements
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (elements[i][j].isBlank()) {
                System.out.println("Enter the element for row " + (i+1) + " and column " + (j+1) + ":");
                elements[i][j] = Integer.toString(scanner.nextInt());
            }
        }
    }
    
    // Check the solution
    if (checkingCorrect()) {
        System.out.println("Congratulations, the answer is correct. ^_^");
    } else {
        System.out.println("Sorry, the answer is incorrect.");
    }
}

			 	

public boolean checkingCorrect() {
    
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


	
	
	//Main method
    public static void main(String[] args) {
        SudokuGame player1 = new SudokuGame(Integer.valueOf(args[0]), args[0].length());	
		}
}
