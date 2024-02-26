package memory;

public class MemoryTester {
    public static void main(String[] args) {
        RAMManager r1= new RAMManager();
        DiskMaganer d1 = new DiskMaganer();

        r1.allocateMemory(3);
        d1.allocateMemory(400);
        r1.freeMemory();
        d1.freeMemory();
        System.out.println(MemoryManager.getMemoryType());
    }
}
