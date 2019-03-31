package com.mmall.model;

import java.util.ArrayList;
import java.util.List;

public class BeerSuggest {
    public List getBrands(String color){
        List<String> brands=new ArrayList<>();
        if(color.equals("blue")){
            brands.add("aaa");
            brands.add("bbb");
        }else {
            brands.add("ccc");
        }
        return brands;
    }
}
