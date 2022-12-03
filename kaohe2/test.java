package kaohe2;

import java.util.Scanner;

public class test {

    public static void main(String[] args) throws InsufficientBalanceException, AnimalNotFountException {

        MyAnimalShop Custom = new MyAnimalShop();
        Scanner sc = new Scanner(System.in);
        MyAnimalShop animalShop = new MyAnimalShop();
        for (int i = 0; i >= 0; i++) {
            System.out.println("欢迎来到宠物店，请选择：");
            System.out.println("1.查看原来动物列表");
            System.out.println("2.加入新的动物，并查看新动物列表");
            System.out.println("3.加入新的顾客,查看顾客列表");
            System.out.println("4.查看宠物店余额");
            int mm = sc.nextInt();
            if (mm == 1) {
                dog d = new dog();
                d.setName("中华田园犬");
                d.setAge(4);
                d.setPrice(100);
                d.setSex("公");
                d.show();
                d.isVaccineInjected(true);
                cat c = new cat();
                c.setName("波斯猫");
                c.setAge(3);
                c.setPrice(200);
                c.setSex("母");
                c.show();
                mouse m = new mouse();
                m.setPrice(50);
                m.setName("小仓鼠");
                System.out.println(m.getName().toString() + m.getPrice());

            } else if (mm == 2) {

                animalShop.newAnimal();
                System.out.println("导入成功");
            } else if (mm == 3) {

                Custom.helloCustomer();
                System.out.println("导入成功");

            } else if (mm == 4) {
            System.out.println(animalShop.restmoney);
            }
        }

    }


}
