package com.xf.design.facade;

/**
 * Created by xufei on 2016/2/22.
 */
public class Computer {
    private Cpu cpu;
    private Disk disk;
    private Memory memory;
    public Computer(){
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }
    public void startup(){
        System.out.println("computer startup");
        cpu.startup();
        memory.startup();
        disk.startup();
    }
    public void shutdown(){
        System.out.print("computer shutdown");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
