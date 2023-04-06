package Object.Medium.Extend.HouseRent.View;


import Object.Medium.Extend.HouseRent.Utils.Utility;
import Object.Medium.Extend.HouseRent.domain.House;
import Object.Medium.Extend.HouseRent.service.HouseService;

import java.util.Scanner;

/**
 * 1. 显示界面
 * 2. 接受用户输入
 * 3. 调用 HouseService 完成各种 CRUD
 */
public class HouseView {
    Scanner myScanner = new Scanner(System.in);
    private boolean loop = true;
    private char key = ' ' ;//接收用户输入

    private HouseService houseService = new HouseService(2);
    public void mainMenu(){
        do {
            System.out.println("===============房屋出租系统===============");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退出");
            System.out.print("请输入你的选择：");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    Update();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }

        }while (loop);
    }

    //编写 listHouse 对象显示房屋信息
    public void listHouse(){
        System.out.println("===============房屋信息展示===============");
        System.out.println("编号\t\t房主\t\t电话\t\t地 址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }

    //编写 addHouse 增加房屋
    public void addHouse(){
        System.out.println("===============添加房屋===============");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(3);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        Integer rent = Utility.readInt();
        System.out.print("出租状态：");
        String state = Utility.readString(3);
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)){
            System.out.println("===============添加完成===============");
        }else {
            System.out.println("===============添加失败===============");
        }
    }

    //编写 delHouse ，接收输入的id号
    public void delHouse(){
        System.out.println("===============删除房屋===============");
        System.out.print("请输入删除房屋的编号( -1 退出)：");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("放弃房屋信息");
            return;
        }
        char key = Utility.readConfirmSelection();
        if (key == 'Y'){
            if (houseService.del(delId)){
                System.out.println("删除成功！");
            }else {
                System.out.println("房屋编号不存在，删除失败……");
            }

        }else {
            System.out.println("你放弃了删除……");
        }
    }

    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }
    public void findHouse(){
        System.out.println("===============查找房屋===============");
        System.out.print("请输入编号：");
        int findId = Utility.readInt();
        House house = houseService.findHouse(findId);
        if (house != null){
            System.out.println(house);
        }else {
            System.out.println("===============查找房屋id不存在===============");
        }
    }
    //根据房屋信息修改
    public void Update(){
        System.out.println("===============修改房屋信息===============");
        System.out.print("请选择待修改房屋编号(-1 退出):");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("===============放弃修改房屋信息===============");
            return;
        }
        //根据输入updateId 查找
        House house = houseService.findHouse(updateId);
        if (house == null){
            System.out.println("===============房屋信息不存在===============");
            return;
        }
        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8,"");
        if (!"".equals(name)){
            house.setName(name);
        }

        System.out.print("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12,"");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.print("地址(" + house.getAddress() + "):");
        String address = Utility.readString(18,"");
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.print("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1){
            house.setRent(rent);
        }
        System.out.print("出租状态(" + house.getState() + "):");
        String state = Utility.readString(3,"");
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("===============房屋信息成功===============");
    }
}
