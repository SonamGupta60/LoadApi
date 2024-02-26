package com.loadApis.loadApis.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Load {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String loading_point ;
    private String unloading_point ;
    private  String product_type ;
    private String truck_type ;
    private int no_of_trucks ;
    private int weight ;
    private String comment;
    private String shipper_id;
    private Date load_date;

    public Load() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLoading_point(String loading_point) {
        this.loading_point = loading_point;
    }

    public void setUnloading_point(String unloading_point) {
        this.unloading_point = unloading_point;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public void setTruck_type(String truck_type) {
        this.truck_type = truck_type;
    }

    public void setNo_of_trucks(int no_of_trucks) {
        this.no_of_trucks = no_of_trucks;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setShipper_id(String shipper_id) {
        this.shipper_id = shipper_id;
    }

    public void setLoad_date(Date load_date) {
        this.load_date = load_date;
    }




    public long getId() {
        return id;
    }

    public String getLoading_point() {
        return loading_point;
    }

    public String getUnloading_point() {
        return unloading_point;
    }

    public String getProduct_type() {
        return product_type;
    }

    public String getTruck_type() {
        return truck_type;
    }

    public int getNo_of_trucks() {
        return no_of_trucks;
    }

    public int getWeight() {
        return weight;
    }

    public String getComment() {
        return comment;
    }

    public String getShipper_id() {
        return shipper_id;
    }

    public Date getLoad_date() {
        return load_date;
    }


    public Load(long id, String loading_point, String unloading_point, String product_type, String truck_type, int no_of_trucks, int weight, String TEXT, String UUID, Date DATE) {
        this.id = id;
        this.loading_point = loading_point;
        this.unloading_point = unloading_point;
        this.product_type = product_type;
        this.truck_type = truck_type;
        this.no_of_trucks = no_of_trucks;
        this.weight = weight;
        this.comment = TEXT;
        this.shipper_id = UUID;
        this.load_date = DATE;
    }


}
