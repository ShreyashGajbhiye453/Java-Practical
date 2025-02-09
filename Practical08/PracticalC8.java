 class PracticalC8 {

    void line(int size, int line, int variable_size){
        if(line <= size + 1){
            spaces(variable_size--, 1);
            pat(1, 2*line-1, line);
            System.out.println();
            line(size, line + 1, variable_size);
            spaces(variable_size + 1, 1);
            pat2(1, 2*line-1, line);
            System.out.println();
        }
    }


    void spaces(int variable_size, int sp){
        if(sp <= variable_size){
            System.out.print(" ");
            spaces(variable_size, sp + 1);
        }
    }

    void pat(int pat, int  line, int line_no){
       if(pat <= line){
            if(line_no % 2 == 0){
                System.out.print("/");
                pat( pat + 1, line, line_no);
            }else{
                System.out.print("*");
                pat( pat + 1, line, line_no);
            }
       }
}

void pat2(int pat, int  line, int line_no){
       if(pat <= line){
            if(line_no % 2 == 0){
                System.out.print("*");
                pat2( pat + 1, line, line_no);
            }else{
                System.out.print("/");
                pat2( pat + 1, line, line_no);
            }
       }
}

    public static void main(String[] args){
        PracticalC8 R1 = new PracticalC8();
        R1.line(3, 1, 3);
    }
}
