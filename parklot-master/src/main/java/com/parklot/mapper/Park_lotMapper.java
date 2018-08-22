package com.parklot.mapper;

import com.parklot.entity.Park_lot;
import com.parklot.entity.lot;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Park_lotMapper {

    //查询所有
    @Select("select * from parking_lot")
    List<Park_lot> findAll();

    @Select("select * from lot")
    List<lot> findAllLots();

    //查询id
    @Select("select * from parking_lot where id=#{id}")
    List<Park_lot> selectById(int id);

    //查询id,lot
    @Select("select * from lot where id=#{id}")
    lot findLotById(int id);

    //已审核的lot
    @Select("select * from justified_lot")
    List<lot> getAllHasJustifiedLots();

    //排序查询
    @Select("select * from lot order by `time` asc")
    List<lot> getAllLotsSortByDate();

    //添加记录
    @Insert("insert into parking_lot values(#{id},#{location},#{description},#{manage_attrib},#{business_circle_pos},#{fee_id},#{district_street},#{property_rights},#{attribute},#{has_charging_pile},#{charging_pile_num},#{building_height},#{cover_area},#{import_path_num},#{export_path_num})")
    public void insertPark_lot(Park_lot pl);

    //添加lot记录
    @Insert("insert into justified_lot(lot_name,lot_addr,id,property_right,owner_building,tel,is_out_road,on_road,has_charging_pile,open_to_public,free_fee,pay_method) values(#{lot_name},#{lot_addr},#{id},#{property_right},#{owner_building},#{tel},#{is_out_road},#{on_road},#{has_charging_pile},#{open_to_public},#{free_fee},#{pay_method})")
    public void insertLot(lot lot);

    //删除记录
    @Delete("delete from parking_lot where id=#{id}")
    public void deletePark_lot(int id);

    //更改
    @Update("update parking_lot set location=#{location},description=#{description},manage_attrib=#{manage_attrib},business_circle_pos=#{business_circle_pos},fee_id=#{fee_id},district_street=#{district_street},property_rights=#{property_rights},attribute=#{attribute},has_charging_pile=#{has_charging_pile},charging_pile_num=#{charging_pile_num},building_height=#{building_height},cover_area=#{cover_area},import_path_num=#{import_path_num},export_path_num=#{export_path_num} where id=#{id}")
    public void update(Park_lot pl);

}
