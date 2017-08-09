package com.winsion.common;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/9:08
 **/
public class ParkingCode {


    /**
     * 停车位状态
     * 0 为空闲
     * 1 为占用
     */
    public static enum ParkingSpaceState{
        OCCUPATION("占用",1),
        FREE("空闲",0);

        private String name;
        private Integer value;
        ParkingSpaceState(String name,Integer value){
            this.setName(name);
            this.setValue(value);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

}
