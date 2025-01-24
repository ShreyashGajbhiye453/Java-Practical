class Practical6{


void printPattern1(int size){ 
	if(size > 0){
	int nextLine = size, sp = 0, pat = 0;
            for(int ln = 1; ln <= 2*size-1; ln++){
                if(ln <= size){
                    for( sp = size-ln; sp > 0; sp--){
                        System.out.print(" ");
                    }
                    for( pat = 2*ln-1; pat > 0; pat--){
                        if(pat % 2 ==0){
                            System.out.print(" ");
                        }
                        else{
                           System.out.print("+");
                       }
                    }
                    System.out.print("\n");
                }
                else{
                    nextLine--;
                    for(int sp2 = ln - size; sp2 > 0; sp2--){
                        System.out.print(" ");
                    }
                    for(int pat2 = (2*nextLine)-1; pat2 > 0; pat2--){
                        if(pat2 % 2 == 0){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("*");
                        }
                    }
           System.out.print("\n");
       
        }}}else{
        return ;} }
        
        
        
        void printPattern2(int size){
         if(size > 0){
         int nextLine = size, sp = 0, pat = 0;
        for(int ln = 1; ln <= 2*size-1; ln++){
            if(ln <= size){
                for( sp = size-ln; sp > 0; sp--){
                    System.out.print(" ");
                }
                for( pat = 2*ln-1; pat > 0; pat--){
   
                        System.out.print("+");
   
                }
   
           }
            else{
               nextLine--;
                for(int sp2 = ln - size; sp2 > 0; sp2--){
                    System.out.print(" ");
                }
                for(int pat2 = (2*nextLine)-1; pat2 > 0; pat2--){
   
                        System.out.print("+");
   
    }            }
        System.out.print("\n");
   
   
   
            }}else{
            return ;}
    }


void printPattern3(int size){
	if(size > 0){
         int symbol = 1, length = size, space = 0;
        for(int ln = 1; ln <= 2*size; ln++){
            if(ln <= size){
                for( space =size-ln; space > 0; space--){
                    System.out.print(" ");
                    }
                for(int pattern = 2*ln-1; pattern > 0; pattern--){
                if(symbol % 2 == 0){
                        System.out.print("*");
                    symbol++;
                    }else{
                        System.out.print("+");
                    symbol++;
                }
             }
            }else if(ln >= size){
                for(int space1 = ln-size-1; space1>0; space1--){
                    System.out.print(" ");
                }
                for(int pattern1 = 2*length-1; pattern1 > 0; pattern1--){
                    if(symbol % 2==0){
                          System.out.print("*");
                        symbol++;
                    }
                    else{
                      System.out.print("+");
                    symbol++;
                    }
   
             }length--;}System.out.print("\n");}}
             else{
             return ;}}
             
             
             
             public static void main(String[] args){
             	Practical6 pattern = new Practical6();
             	pattern.printPattern1(3);
             	System.out.print("\n");
                pattern.printPattern2(3);
                System.out.print("\n");
                pattern.printPattern3(3);
             
             }}
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
