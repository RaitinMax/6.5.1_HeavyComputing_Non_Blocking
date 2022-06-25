public class Finonacci {
    private long nOfFibonacci;


    public Finonacci(long nOfFibonacci) {
        long num1 = 0;
        long num2 = 1;
        long counter = 0;
        long result = 0;
        while (counter < nOfFibonacci) {
            int num3;
//            System.out.print(num1+" ");
            num3 = (int) (num2 + num1);
            result = num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
        this.nOfFibonacci = result;

    }

    @Override
    public String toString() {
        return "" +this.nOfFibonacci;
    }
}
