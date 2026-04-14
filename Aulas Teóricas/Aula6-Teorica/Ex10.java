public class Ex10 {
    public static void main(String[] args) {

        double vm = 500000.00;
        double ma = 15000.00;
        double va = 0;
        double m = 0;
        int i = 0;
        
        while (va<m) {
            va = vm - (vm * 0.12);
            m = ma + 5000;
            System.out.println("\n"+ va + i);
            i++;
        }
    }
}
