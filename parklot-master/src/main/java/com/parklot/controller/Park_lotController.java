package com.parklot.controller;

import com.parklot.entity.Park_lot;
import com.parklot.entity.lot;
import com.parklot.service.Park_lotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Park_lotController {
    @Autowired
    private Park_lotService plService;


//    @RequestMapping("/list2")
//    public List<Park_lot> listPark_lot(Model model){
//        List<Park_lot> park_lots = plService.getAll();
//        model.addAttribute("park_lots",park_lots);
//        return park_lots;
//        //本来写的return "/list"
//    }
    //显示所有
    @RequestMapping("/list")
    public String list(Model model){
        List<Park_lot> park_lots = plService.getAll();
        model.addAttribute("park_lots",park_lots);
        return "main";
        //本来写的return "/list"
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    //id条件筛选
    @RequestMapping("/selectById")
    public String selectById(@RequestParam("id") int id, Model model){
        List<Park_lot> pls = plService.selectById(id);
        model.addAttribute("ids",pls);
        return "idList";
    }
    //转到添加页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    //添加
    @RequestMapping("/add")
    public String addPark_lot(Park_lot pl,BindingResult bindingResult) {

//        Park_lot lot = new Park_lot();
//        lot.setAttribute(pl.getAttribute());
//        lot.setBuilding_height(pl.getBuilding_height());
//        lot.setBusiness_circle_pos(pl.getBusiness_circle_pos());
//        lot.setCover_area(pl.getCover_area());
//        lot.setDescription(pl.getDescription());
//        lot.setDistrict_street(pl.getDistrict_street());
//        lot.setExport_path_num(pl.getExport_path_num());
//        lot.setFee_id(pl.getFee_id());
//        lot.setImport_path_num(pl.getImport_path_num());
//        lot.setProperty_rights(pl.getProperty_rights());
//        lot.setId(pl.getId());
//        lot.setManage_attrib(pl.getManage_attrib());
//        lot.setLocation(pl.getLocation());
//        lot.setBuilding_height(pl.getBuilding_height());
//        lot.setHas_charging_pile(pl.isHas_charging_pile());

            plService.addPark_lot(pl);

        return "redirect:/list";
//        return "redirect:/list";
    }



    //删除
    @RequestMapping("/delete")
    public String deletePark_lot(int id) {
        plService.delPark_lot(id);
        return "redirect:/list";
    }

    //转向百度地图
    @RequestMapping("/toLocate")
    public String toLocate(){
        return "locate";
    }

    //转向修改
    @RequestMapping("/update")
    public String update(@RequestParam("id") int id,Model model){
        List<Park_lot> pls = plService.selectById(id);
        model.addAttribute("pls",pls);
        return "update";
    }

    //修改
    @RequestMapping("/updateSubmit")
    public String update(Park_lot pl,BindingResult bindingResult){

        plService.update(pl);
        return "redirect:/list";
    }

    //停车场信息录入2
    @RequestMapping("/lot")
    public String toLot(@RequestParam("id") int id,Model model){
        lot lot2 = plService.findLotById(id);
        model.addAttribute("lot",lot2);
        return "parklot_info_submit";
    }

    @RequestMapping("/insertLot")
    public String insertLot(lot lot, BindingResult bindingResult) {

        plService.insertLot(lot);

        return "redirect:/justify";
//        return "redirect:/list";
    }

    @RequestMapping("/justify")
    public String toJustify(Model model){
        List<lot> lots = plService.getAllLots();
        model.addAttribute("applied_lots",lots);
        return "justify";
    }

    @RequestMapping("/has_justified")
    public String has_justified(Model model){
        List<lot> lots = plService.getAllHasJustifiedLots();
        model.addAttribute("applied_lots",lots);
        return "justify";
    }

    //sort排序
    @RequestMapping("/sort")
    public String sort(Model model){
        List<lot> lots = plService.getAllLotsSortByDate();
        model.addAttribute("applied_lots",lots);
        return "justify";
    }

}
