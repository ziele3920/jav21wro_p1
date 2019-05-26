package com.sda.list;

public class MainList {
    public static void main(String[] args) {
        LinkedList<Integer> arrList = new LinkedList();
        for(int i = 0; i < 4; ++i)
            arrList.add(i);
        arrList.add(0, 66);
        //arrList.add(2);
        //arrList.add(4);
        //arrList.add(arrList.size(), 12);
        //arrList.remove(arrList.size()-1);
        for (int i = 0; i < arrList.size(); ++i)
            System.out.print(arrList.get(i) + ", ");
    }
}
