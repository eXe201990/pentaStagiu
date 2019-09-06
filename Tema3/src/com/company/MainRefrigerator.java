package com.company;

import java.util.ArrayList;
import java.util.List;

public class MainRefrigerator {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new SmartRefrigerator());
        list.add(new Car());
        list.add(new Phone());

        for(Object o : list){
            if ( o instanceof  Car){
                ((Car) o).connectToBluetooth();
            }
            if(o instanceof  SmartRefrigerator){
                ((SmartRefrigerator) o).connectToBluetooth();
            }
            if (o instanceof Phone) {
                ((Phone) o).connectToBluetooth();
            }
        }
    }
}
