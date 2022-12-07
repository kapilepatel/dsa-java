public class Utility {

    public void fun1()
    {
        rec1(5,5);

    }

    private void rec1(int c, int r) {
        if (r == 0 && c==0) {
            return;
        }
        if (c == 0) {
            System.out.println("\n");
            rec1( r-1,  r-1);
            return;
        }
        System.out.print("*");
        rec1( --c,  r);
    }

    public void fun2()
    {
        rec1(5,0);

    }


    private void rec2(int c, int r) {
        if (c == r) {
            System.out.println("\n");
            rec1( r-1,  r-1);
        }
        if (c == 0) {

            return;
        }
        System.out.print("*");
        rec1( --c,  r);
    }
}
