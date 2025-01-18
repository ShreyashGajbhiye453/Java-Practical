class Practical5{
	//Function to find factorial of a number using the for loop
	int getFactorial1(int number){
		if(number > 2){
			int factorial = 2;
			for(int i =number; i > 2;){
				factorial *= i--;
			}
			return factorial;
		}else if(number == 2){
			return 2;
		}else if(number < 0){
			return -1;
		}else{return 1;
}}

	//Function to find the factorial of a number using the while loop
	int getFactorial2(int number){
	if(number > 2){
		int factorial = 2;
		while(number > 2){
			factorial *= number--;}
			return factorial;

	}else if(number == 2){
		return 2;
	}else if(number < 0){
		return -1;
}else{
return 1;
}
}


	//Function to find the factorial of a number without using any loop
	int getFactorial3(int number){
		if(number > 2){
			return number * getFactorial3(--number);
			 	}else if(number == 2){
			return 2;}else if(number < 0){
			return -1;
}else{return 1;}
}
	
	static int index = 0;
	//Function to get the sum of all the numbers in the array;
	int getSum(int[] numbers){
	if(index < numbers.length){
		return numbers[index++] + getSum(numbers);

	}else{
	return 0;
	}
}

	public static void main(String[] args){
	Practical5 FunctionCaller = new Practical5();

	//Factorial part:-
	for(int i =3; i < 7; i++){
	System.out.println("For i = "+i);
	System.out.println("With for loop:"+FunctionCaller.getFactorial1(i));
	System.out.println("With while loop:"+FunctionCaller.getFactorial2(i));
	System.out.println("Without any loop:"+FunctionCaller.getFactorial3(i));
	}

	//Array sum:-
	int numbers[] = {1,2,3,4,5};
	System.out.println("Array sum:"+FunctionCaller.getSum(numbers));
	}
}
