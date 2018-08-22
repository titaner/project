package com.parklot.entity;

import java.util.Date;

public class lot {
    String lot_name;
    String lot_addr;
    int id;
    String property_right;
    String owner_building;
    String tel;
    Boolean is_out_road;
    String on_road;
    Boolean has_charging_pile;
    String open_to_public;
    String free_fee;
    String pay_method;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    Date time;

    public String getLot_name() {
        return lot_name;
    }

    public void setLot_name(String lot_name) {
        this.lot_name = lot_name;
    }

    public String getLot_addr() {
        return lot_addr;
    }

    public void setLot_addr(String lot_addr) {
        this.lot_addr = lot_addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProperty_right() {
        return property_right;
    }

    public void setProperty_right(String property_right) {
        this.property_right = property_right;
    }

    public String getOwner_building() {
        return owner_building;
    }

    public void setOwner_building(String owner_building) {
        this.owner_building = owner_building;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Boolean getIs_out_road() {
        return is_out_road;
    }

    public void setIs_out_road(Boolean is_out_road) {
        this.is_out_road = is_out_road;
    }

    public String getOn_road() {
        return on_road;
    }

    public void setOn_road(String on_road) {
        this.on_road = on_road;
    }

    public Boolean getHas_charging_pile() {
        return has_charging_pile;
    }

    public void setHas_charging_pile(Boolean has_charging_pile) {
        this.has_charging_pile = has_charging_pile;
    }

    public String getOpen_to_public() {
        return open_to_public;
    }

    public void setOpen_to_public(String open_to_public) {
        this.open_to_public = open_to_public;
    }

    public String getFree_fee() {
        return free_fee;
    }

    public void setFree_fee(String free_fee) {
        this.free_fee = free_fee;
    }

    public String getPay_method() {
        return pay_method;
    }

    public void setPay_method(String pay_method) {
        this.pay_method = pay_method;
    }


}
