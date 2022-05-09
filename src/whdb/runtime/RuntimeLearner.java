package whdb.runtime;

public class RuntimeLearner {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        System.out.println(rt.availableProcessors());
        System.out.println(rt.totalMemory());
        rt.exit(10);
    }
}
