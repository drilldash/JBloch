package org.item2;

import com.sun.xml.internal.ws.util.QNameMap;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestComputerBuild {
    public static void main(String[] args) {
        Computer Comp = new Computer.Builder(1, 3).hasDiscreteGpu(Boolean.TRUE).cpuName("AMD").build();


//        Class<?> c = Comp.getClass();
//        Field[] fields = c.getDeclaredFields();
//        Map<String, Object> temp = new HashMap<String, Object>();
//
//        for( Field field : fields ){
//            try {
//                temp.put(field.getName().toString(), field.get(Comp));
//            } catch (IllegalArgumentException e1) {
//            } catch (IllegalAccessException e1) {
//            }
//        }
//
//        System.out.println(Arrays.toString(fields));
//
//        System.out.println(fields[0]);

        System.out.println(Comp.toString());


//        for (Map.Entry<String, Object> entry : temp.entrySet()) {
//            String key = entry.getKey();
//            Object value = entry.getValue();
//            System.out.println(key+":::"+value);
//            // do stuff
//        }




    }
}