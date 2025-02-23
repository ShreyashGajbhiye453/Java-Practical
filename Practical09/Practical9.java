class Practical9{
	
	//For the comparision between two methods for factorial
	
	//Factorial with the help of the looping statement
	public static int factorial1(int number){
		int factorial = 1;
		for(int i = number; i > 1;){
			factorial *= i--;
		}
		return factorial;
	}	
	
	
	//Factorial with the help of the Recursion
	public static int factorial2(int number){
		if(number > 1){
			return number * factorial2(number-1);
		}
		else{
			return 1;
		}
	}
	
	
	
	//For the comparision between two methods for String append
	
	//First append in String
	public static void stringAppend1(String[] values){
		String concatinating  = "";
		for(int i = values.length - 1; i >= 0; i--){
			concatinating = concatinating + values[i];
		}
	}
	
	//Second append in StringBuffer
	public static void stringAppend2(String[] values){
		StringBuffer concatinating  = new StringBuffer("");
		for(int i = values.length - 1; i >= 0; i--){
			concatinating.append(values[i]);
		}
	}
	
	//Third append in StringBuilder
	public static void stringAppend3(String[] values){
		StringBuilder concatinating  = new StringBuilder("");
		for(int i = values.length - 1; i >= 0; i--){
			concatinating.append(values[i]);
		}
	}
	

	public static void main(String[] args){
		
		//For the factorial method comparision
		long startTime = 0;
		long endTime = 0;
		int value = 0;
		int factorial1Time = 0;
		int factorial2Time = 0;
		long stringTime = 0;
		long stringBufferTime = 0;
		long stringBuilderTime = 0;
		int size = Integer.parseInt(args[0]);
		int[] differentNumbers = new int[size];
		
		//Filling the different values in array randomly
		for(int j = differentNumbers.length - 1; j >= 0; j--){
			differentNumbers[j] = (int)(System.nanoTime() % 100 + 1); //The range is from 1 to 100
		}
		
		 
		//For loop for calculating the performance of the different method for same concept
		for(int arr = differentNumbers.length - 1; arr >=0; arr--){
			
			//For factorial with the help of the looping statement
			startTime = System.nanoTime();
			value = factorial1(differentNumbers[arr]);
			endTime = System.nanoTime();
			factorial1Time += endTime - startTime;
			
			
			//For factorial with the help of the Recursion
			startTime = System.nanoTime();
			value = factorial2(differentNumbers[arr]);
			endTime = System.nanoTime();
			factorial2Time += endTime - startTime;
			
		}
		
		factorial1Time = factorial1Time / differentNumbers.length;
		factorial2Time = factorial2Time / differentNumbers.length;
		System.out.println("Average time taken by looping method is : " + factorial1Time);
		System.out.println("Average time taken by recursive method is : " + factorial2Time);
		
		
		//For the class String, StringBuilder, StringBuffer comparision
		
		
		int sizeForStrings = Integer.parseInt(args[1]);
		String[] differentStrings = new String[sizeForStrings];
		//Filling the different values in array randomly
		for(int j = differentStrings.length - 1; j >= 0; j--){
			differentStrings[j] = String.valueOf((System.nanoTime() % 1000 + 1)); //The range is from 1 to 100
		}
		
		
		//For loop for calculating the performance of the String, StringBuilder, StringBuffer 
		
			
			//For String class to append
			startTime = System.nanoTime();
			stringAppend1(differentStrings);
			endTime = System.nanoTime();
			stringTime = endTime - startTime;
			
			
			//For StringBuffer class to append
			startTime = System.nanoTime();
			stringAppend2(differentStrings);
			endTime = System.nanoTime();
			stringBufferTime = endTime - startTime;
			
			//For StringBuilder class to append
			startTime = System.nanoTime();
			stringAppend3(differentStrings);
			endTime = System.nanoTime();
			stringBuilderTime = endTime - startTime;
			
		
		stringTime = stringTime / differentStrings.length;
		stringBufferTime = stringBufferTime / differentStrings.length;
		stringBuilderTime = stringBuilderTime / differentStrings.length;
		System.out.println("Average time taken by String class to append : " + stringTime);
		System.out.println("Average time taken by StringBuffer class to append : " + stringBufferTime);
		System.out.println("Average time taken by StringBuilder class to append : " + stringBuilderTime);
		
	}
}
			
