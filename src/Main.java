public class Main {
    public static void main(String[] args) {
        long[] arr = {1, 200, 300, 500};
        SalesManager salesManager = new SalesManager(arr);
        long max = SalesManager.max();
        System.out.println(max);
    }
}