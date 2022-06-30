package com.mh.wx2.model.weather;

import lombok.Data;

import java.io.Serializable;

@Data
public class CityCode implements Serializable {
    /**
     * id : 1
     * pid : 0
     * city_code : 101010100
     * city_name : 北京
     * post_code : 100000
     * area_code : 010
     * ctime : 2019-07-11 17:30:06
     */

    private int id;
    private int pid;
    private String city_code;
    private String city_name;
    private String post_code;
    private String area_code;
    private String ctime;
}
