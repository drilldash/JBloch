package org.item2;

public class TestComputerBuild {
    public static void main(String[] args) {
        Computer Comp = new Computer.Builder(1, 3)
                .hasDiscreteGpu(Boolean.TRUE)
                .cpuName("AMD")
                .gpuName("Radeon 7860")
                .build();

        System.out.println(Comp.toString());
    }
}