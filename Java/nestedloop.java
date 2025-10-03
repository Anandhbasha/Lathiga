public class nestedloop {
    public static void main(String[] args) {
        // 3 rows each row have 5 seats
        // row 1 seat 1
        // row 1 seat 2
        // row 1 seat 3
        // row 1 seat 4
        // row 1 seat 5

        // row 2 seat 1
        // row 2 seat 2
        // row 2 seat 3
        // row 2 seat 4
        // row 2 seat 5

        // row 3 seat 1
        // row 3 seat 2
        // row 3 seat 3
        // row 3 seat 4
        // row 3 seat 5

        for (int row=1;row<=3;row++){
            for (int seat=1;seat<=5;seat++){
                System.out.println("Row:"+ row + "seat:"+seat);
            }
            System.out.println("-");
        }
    }
}
