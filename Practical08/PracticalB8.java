 class PracticalB8 {

     void line(int line, int size, int variable_size){
        if(line <= size+1){
            spaces(variable_size--, 1);
            pat(1, line, size);
            System.out.println();
            line(line + 1, size, variable_size);
            if(line < size+1){
            spaces(variable_size + 1, 1);
            pat1(1,line, size);
            System.out.println();
            }
        }
    }

     void spaces(int variable_size, int sp){
        if(sp <= variable_size){
            System.out.print(" ");
            spaces(variable_size, sp + 1);
        }
    }

     void pat(int pat, int line, int size){
       if(pat <= line){
            if(line < size + 1){
                System.out.print("*");
                pat(pat + 1, line, size);
            }else{
                System.out.print("+");
                pat(pat + 1, line, size);
            }
       }
}

   void pat1(int pat, int line, int size){
       if(pat <= line){
          System.out.print("/");
          pat1(pat + 1, line, size);
       }
}


    public static void main(String[] args){
        PracticalB8 R1 = new PracticalB8();
        R1.line(1, 3, 3);
    }
}
