class PracticalA8{
     void line(int line, int size){
        if(line <= size+1){
            pat(1, line);
            System.out.println();
            line(line + 1, size);
            if(line < size+1){
            pat(1,line);
            System.out.println();
            }
        }
    }

     void pat(int pat, int line){
        if(pat <= line){
            System.out.print("*");
            pat(pat + 1, line);
            }
    }


    public static void main(String[] args){
        PracticalA8 R1 = new PracticalA8();
        R1.line(1, 3);
    }
}
