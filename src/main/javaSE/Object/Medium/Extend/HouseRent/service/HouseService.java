package Object.Medium.Extend.HouseRent.service;

import Object.Medium.Extend.HouseRent.domain.House;


/**
 * 1. 响应 HouseView 的调用
 * 2. 完成对房屋信息的各种操作
 */
public class HouseService {
    private House[] houses;//存放 House 对象
    private int houseNum = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的 id 自增长
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"jack","112","宁波市",2000,"未出租");
    }

    public House[] list(){
        return houses;
    }

    //添加数组
    public Boolean add(House newHouses){
        //判断是否超过最大值
        if (houseNum == houses.length){
            System.out.println("数组已满，不能继续添加……");
            return false;
        }
        // House[] otherHouse = new House[houseNum+1];
        // for (int i = 0; i < houses.length; i++) {
        //     otherHouse[i] = houses[i];
        // }
        houses[houseNum++] = newHouses;
        //设计 id 自增长
        newHouses.setId(++idCounter);

        return true;
    }

    //删除房屋信息，根据id
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if ( delId == houses[i].getId()){//要删除的房屋id，是数组下标为i的元素
                index = i;
                break;
            }
        }
        if (index == -1){
            return false;
        }
        /**
         * 删除第n个，从n+1往前移动一直到最后一位滞空
         */
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
    }
     public House findHouse(int findId){
        int index = -1;

         for (int i = 0; i < houseNum; i++) {
             if (findId == houses[i].getId()){
                 return houses[i];
             }
         }
         return null;
     }
}
