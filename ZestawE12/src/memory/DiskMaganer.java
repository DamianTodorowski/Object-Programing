package memory;

public class DiskMaganer implements MemoryManager{
    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating Disk Space");
    }

    @Override
    public void freeMemory() {
        MemoryManager.super.freeMemory();
    }
}
