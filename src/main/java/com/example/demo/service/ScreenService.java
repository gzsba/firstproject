package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ScreenService {
	private int mx, my;
    public ScreenService() {
    }
    //接受鼠标位置
    public void setMxAndMy(int mx,int my) {
        this.mx=mx;
        this.my=my;
    }
    //打印鼠标位置信息
    public void print() {
        System.out.println("鼠标的位置 "+mx+","+my);
    }
    @Override
    public String toString() {
        return "ScreenService [mx=" + mx + ", my=" + my + "]";
    }
}
