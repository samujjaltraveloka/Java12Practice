package com.samujjal.entrypoint;

import dev.samujjal.moduleone.HiModule;
import dev.samujjal.mohar.NativeTool;

public class Main {
    public static void main(String[] args) {
        var sam = "hello";
        HiModule hiModule = new HiModule();
        System.out.println(hiModule.getHi());
        funcOver(sam);
        NativeTool nativeTool = getNativeTool();
        try (nativeTool) {
            nativeTool.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void funcOver(String s) {
        System.out.println("String: " + s);
    }

    static void funcOver(Object o) {
        System.out.println("Object " + o);
    }

    static NativeTool getNativeTool() {
        return new NativeTool();
    }
}
