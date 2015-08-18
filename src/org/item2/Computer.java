package org.item2;

import java.lang.reflect.Field;

/**
 * Created by verlorener on 17.08.15.
 */
public class Computer {
    private final int numCpuCores;
    private final String cpuName;
    private final Boolean hasDiscreteGpu;
    private final String  gpuName;
    private final int numUsbPorts;

    public static class Builder {
        //required params
        private final int numCpuCores;
        private final int numUsbPorts;

        //Optional
        private String cpuName = "Intel Core i7 4920K";
        private String gpuName = "Nvidia GTX 960M";
        private Boolean hasDiscreteGpu = Boolean.FALSE;

        public Builder( int numCpuCores, int numUsbPorts) {
            this.numCpuCores = numCpuCores;
            this.numUsbPorts = numUsbPorts;
        }

        public Builder cpuName(String val){
            cpuName = val; return this;
        }

        public Builder gpuName(String val){
            gpuName = val; return this;
        }

        public Builder hasDiscreteGpu(Boolean val){
            hasDiscreteGpu = val; return this;
        }

        public Computer build() {
            return new Computer(this);
        }




    }
    private Computer(Builder builder) {
        numCpuCores =builder.numCpuCores;
        numUsbPorts=builder.numUsbPorts;

        cpuName = builder.cpuName;
        gpuName =builder.gpuName;
        hasDiscreteGpu= builder.hasDiscreteGpu;
    }


    @Override
    public String toString() {
        return "CPU Model: " + this.cpuName + "\n" +
                "Cores: " + this.numCpuCores + "\n" +
                "Discrete GPU: " + this.hasDiscreteGpu + "\n" +
                "GPU Model: "+this.gpuName + "\n" +
                "USB Ports: "+this.numUsbPorts + "\n";
    }

//    //http://stackoverflow.com/questions/1526826/printing-all-variables-value-from-a-class
//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        String newLine = System.getProperty("line.separator");
//
//        result.append( this.getClass().getName() );
//        result.append( " Object {" );
//        result.append(newLine);
//
//        //determine fields declared in this class only (no fields of superclass)
//        Field[] fields = this.getClass().getDeclaredFields();
//
//        //print field names paired with their values
//        for ( Field field : fields  ) {
//            result.append("  ");
//            try {
//                result.append( field.getName() );
//                result.append(": ");
//                //requires access to private field:
//                result.append( field.get(this) );
//            } catch ( IllegalAccessException ex ) {
//                System.out.println(ex);
//            }
//            result.append(newLine);
//        }
//        result.append("}");
//
//        return result.toString();
//    }






}


