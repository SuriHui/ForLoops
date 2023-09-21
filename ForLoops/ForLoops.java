public class ForLoops
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d= -8;

    public void run() {
        System.out.println(" ");
        for (int i = 0; i >= 15; i++) {
            System.out.println("i is equal to " +i);
        }
        System.out.println (" ");
        for (int j = 10; j == 0; j = j - 2) {
            System.out.println("j is equal to " +j);
        }
        System.out.println(" ");
        for (int k = 10; k == 0; k = k - 3) {
            System.out.println("k is equal to " +k);
        }
    }

    public static void main(String[] args)
    {
        ForLoops hw = new ForLoops();
        hw.run();
    }
}