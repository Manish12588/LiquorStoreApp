
package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

public class LiquorService {

    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.WINE)){
            brands.add("Adrianna Vineyard");
            brands.add(("Sula Rasa Shiraz")); //Sula Rasa Shiraz is best served at 16-degree Celsius and is produced from the estate vineyards of Sula.
            brands.add("Grover La Reserve"); //Manufactured in Nandi Hills of Bangalore, Grover La Reserve is aged for 16 months in new French oak.
            brands.add("KRSMA Sangiovese"); //KRSMA Sangiovese comes from the vineyards of Hampi.

        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");
            brands.add("Jack Daniel's");
            brands.add("Jameson");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");
            brands.add("KingFisher");
            brands.add("Heineken");
            brands.add("Budweiser");

        } else if (type.equals(LiquorType.RUM)) {
            brands.add("Old Monk");
            brands.add("Bacardi");
            brands.add("El Dorado");
            brands.add("Captain Morgan");

        }
        else if (type.equals(LiquorType.VODKA)) {
            brands.add("Absolute");
            brands.add("Smirnoff");
            brands.add("Belvedere");
            brands.add("Ciroc");

        }
        else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}