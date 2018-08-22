package com.parklot.service;

import com.parklot.entity.Park_lot;
import com.parklot.entity.lot;
import com.parklot.mapper.Park_lotMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Park_lotService {

    @Autowired
    private Park_lotMapper plMapper;

    //查询全部
    public List<Park_lot> getAll(){
        return plMapper.findAll();
    }

    public List<lot> getAllLots(){return plMapper.findAllLots();}

    public List<lot> getAllLotsSortByDate(){return plMapper.getAllLotsSortByDate();}

    public List<lot> getAllHasJustifiedLots(){return plMapper.getAllHasJustifiedLots();}

    //删除
    @Transactional
    public boolean delPark_lot(int id) {
        try {
            plMapper.deletePark_lot(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //添加
    @Transactional
    public boolean addPark_lot(Park_lot pl) {
        try {
            plMapper.insertPark_lot(pl);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //添加lot
    @Transactional
    public boolean insertLot(lot lot) {
        try {
            plMapper.insertLot(lot);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //id查询
    @Transactional
    public List<Park_lot> selectById(int id){
        return plMapper.selectById(id);

    }

    //id查询lot
    @Transactional
    public lot findLotById(int id){
        return plMapper.findLotById(id);

    }

    //修改
    @Transactional
    public boolean update(Park_lot pl){
        plMapper.update(pl);
        return true;
    }
}
