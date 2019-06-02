package dev.samujjal.mohar;

public class NativeTool implements AutoCloseable {

    public void doSomething() {
        System.out.println("Native Tool is working");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Native tool is closed");
    }
}
