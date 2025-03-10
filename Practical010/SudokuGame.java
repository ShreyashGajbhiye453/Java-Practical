class SudokuGame{


	public static String gridPrinting(int size, int length){
		String[][] elements = crerateElement(size, length);
		int layout = 2*size + 1;
		String pattern = "";
		for(int i = 1; i <= layout; i++){
			for(int j = 1; j <= layout; j++){
				if((i % 2 == 1) && (j % 2 == 0)){
					for(int k = 1; k <= length; k++){
						pattern = pattern + "-";
					}
					}else if((i % 2 == 1) && (j % 2 == 1)){
						pattern = pattern + " ";
					}else if((i % 2 == 0) && (j % 2 == 1)){
						pattern = pattern + "|";
						}else if((i % 2 == 0) && (j % 2 == 0)){
						  
						int k1 = (i - 1)/2;
						int k2 =  (j - 1)/2;
						if((k1 < size) && (k2 < size)){
							pattern = pattern + elements[k1][k2];
					
						}
				}
				}
			pattern = pattern + "\n";
		}
		
		return pattern;
			
}		


	public static String[][] crerateElement(int size, int length){
		String[][] elements = new String[size][size];
		int count = 0;
		for(int i = 0; i < size; i++)
		{	count = i;
		for(int j = 0; j < size; j++){
				int random = (int)(System.nanoTime() % size);
				if((random == i) || (random == j)){
				elements[i][j] = String.format("%" + length + "s",(count % size) + 1);
				count++;
				}else{
					elements[i][j] = String.format("%" + length + "s","");
				count++;
				}
		} 
		}
		return elements;
	
	}
		
		
		
		
		
			
	public static void main(String[] args){
		int size = Integer.parseInt(args[0]);
		int length = args[0].length();
		System.out.println(gridPrinting(size, length));
		}
		
}
