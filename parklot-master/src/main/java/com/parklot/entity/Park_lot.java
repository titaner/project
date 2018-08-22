package com.parklot.entity;

public class Park_lot {
	private int id;
	private String location;
	private String description;
	private int manage_attrib;
	private int business_circle_pos;
	private int fee_id;
	private int district_street;
	private int property_rights;
	private int attribute;
	private boolean has_charging_pile;
	private int charging_pile_num;
	private double building_height;
	private double cover_area;
	private int import_path_num;
	private int export_path_num;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getManage_attrib() {
		return manage_attrib;
	}

	public void setManage_attrib(int manage_attrib) {
		this.manage_attrib = manage_attrib;
	}

	public int getBusiness_circle_pos() {
		return business_circle_pos;
	}

	public void setBusiness_circle_pos(int business_circle_pos) {
		this.business_circle_pos = business_circle_pos;
	}

	public int getFee_id() {
		return fee_id;
	}

	public void setFee_id(int fee_id) {
		this.fee_id = fee_id;
	}

	public int getDistrict_street() {
		return district_street;
	}

	public void setDistrict_street(int district_Street) {
		district_street = district_Street;
	}

	public int getProperty_rights() {
		return property_rights;
	}

	public void setProperty_rights(int property_rights) {
		this.property_rights = property_rights;
	}

	public int getAttribute() {
		return attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	public boolean isHas_charging_pile() {
		return has_charging_pile;
	}

	public void setHas_charging_pile(boolean has_charging_pile) {
		this.has_charging_pile = has_charging_pile;
	}

	public int getCharging_pile_num() {
		return charging_pile_num;
	}

	public void setCharging_pile_num(int charging_pile_num) {
		this.charging_pile_num = charging_pile_num;
	}

	public double getBuilding_height() {
		return building_height;
	}

	public void setBuilding_height(double building_height) {
		this.building_height = building_height;
	}

	public double getCover_area() {
		return cover_area;
	}

	public void setCover_area(double cover_area) {
		this.cover_area = cover_area;
	}

	public int getImport_path_num() {
		return import_path_num;
	}

	public void setImport_path_num(int import_path_num) {
		this.import_path_num = import_path_num;
	}

	public int getExport_path_num() {
		return export_path_num;
	}

	public void setExport_path_num(int export_path_num) {
		this.export_path_num = export_path_num;
	}
}
