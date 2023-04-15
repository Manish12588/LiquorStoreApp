
package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

public class LiquorService {

    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.WINE)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));

        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");

        } else if (type.equals(LiquorType.SUNDAY)) {
            brands.add("SUNDAY");

        }
        else if (type.equals(LiquorType.MONDAY)) {
            brands.add("MONDAY");

        }
        else if (type.equals(LiquorType.TUESDAY)) {
            brands.add("TUESDAY");

        }
        else if (type.equals(LiquorType.WEDNESDAY)) {
            brands.add("WEDNESDAY");

        }
        else if (type.equals(LiquorType.THURSDAY)) {
            brands.add("THURSDAY");

        }
        else if (type.equals(LiquorType.FRIDAY)) {
            brands.add("FRIDAY");

        }
        else if (type.equals(LiquorType.SATURDAY)) {
            brands.add("SATURDAY");

        } else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}