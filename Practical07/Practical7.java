class Practical7{

    public static void printName(int size) {


        if(size <= 0){
            return ;
        }else{

        //Calculation of column, row, mid, column_start  and the odd_even
        int column = size + 2;
        int row = 2 * column + 1;
        int mid = row / 2 + 1;
        int column_start = 3;
        int odd_even = column % 2;
        //----------------------------------------------------

        //Letter - 'S'
        for (int ln = 1; ln <= row; ln++) {
            for (int up = 1; up <= column; up++) {
                if (((ln == 1) && (up > 1)) || (((ln > 1) && (ln < mid)) && (up == 1)) || ((ln == mid) && ((up > 1) && (up < column))) || (((ln > mid) && (ln < row)) && (up == column)) || ((ln == row) && (up < column))) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.print("      ");

            //Letter - 'H'
            for (int up = 1; up <= column; up++) {
                if ((up == 1) || (up == column) || (ln == mid)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("      ");

            //Letter - 'R'
            for (int up = 1; up <= column; up++) {
                if ((((ln == 1) && (up < column)) || (up == 1)) || (((up == column) && (ln != 1) && (ln < mid))) || ((ln == mid) && (up < column)) ||(ln > mid && up == ln - mid + 1)) {
                    System.out.print("#");
                    if(up == column_start){
                        column_start++;
                    }
                    
                } else {
                    System.out.print(" ");
                    if (up == column_start) {
                        column_start++;
                    }
                }
            }

            System.out.print("      ");
            //Letter - 'E'
            for (int up = 1; up <= column; up++) {
                if (ln == 1 || ln == row || (ln == mid && up < column) || up == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("      ");
            //Letter - 'Y'
            for (int up = 1; up <= column; up++) {
                if (odd_even == 0) {
                    if (((up == 1) || (up == column)) && (ln <= column) || ((ln > column) && ((up == column / 2) || (up == column / 2 + 1))) || (ln == mid)) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (((up == 1) || (up == column)) && (ln <= column) || ((ln > column) && (up == column / 2 + 1)) || (ln == mid)) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }

                }
            }

            System.out.print("      ");
            //Letter - 'A'
            for (int up = 1; up <= column; up++) {
                if (((ln == 1) && (up != 1) && (up != column)) || ((ln != 1) && ((up == 1) || (up == column))) || (ln == mid)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("      ");
            //Letter - 'S'
            for (int up = 1; up <= column; up++) {
                if (((ln == 1) && (up > 1)) || (((ln > 1) && (ln < mid)) && (up == 1)) || ((ln == mid) && ((up > 1) && (up < column))) || (((ln > mid) && (ln < row)) && (up == column)) || ((ln == row) && (up < column))) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.print("      ");

            //Letter - 'H'
            for (int up = 1; up <= column; up++) {
                if ((up == 1) || (up == column) || (ln == mid)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("      ");

            System.out.println();
        }
    }

    }

    public static void main(String[] args) {
        String size = args[0];
        int size1 = Integer.parseInt(size);
        printName(size1);
    }
}
