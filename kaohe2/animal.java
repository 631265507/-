package kaohe2;

import javax.naming.Name;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Animal1 {
    private String name;
    private int age;
    private String sex;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }
}


class dog extends Animal1 {
    public static void isVaccineInjected(boolean s) {
        if (s == true) {
            System.out.println("注射了狂犬疫苗");
        } else {
            System.out.println("未注射狂犬疫苗");
        }
    }

    public void show() {

        System.out.println("名称" + getName() + "性别" + getSex() + "年龄" + getAge() + "价格" + getPrice());
    }
}

class cat extends Animal1 {
    public void show() {

        System.out.println("名称" + getName() + "性别" + getSex() + "年龄" + getAge() + "价格" + getPrice());
    }

}

class mouse extends Animal1 {

}

class Customer {
    private String name;
    private int gotshore;
    private LocalDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGotshore() {
        return gotshore;
    }

    public void setGotshore(int gotshore) {
        this.gotshore = gotshore;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", gotshore=" + gotshore +
                ", date=" + date +
                '}';
    }
}

interface AnimalShop {
    public void newAnimal() throws InsufficientBalanceException;

    public void helloCustomer() throws AnimalNotFountException;

    public void xieYe();


}

class MyAnimalShop implements AnimalShop {
    ArrayList ma = new ArrayList();
    ArrayList cu = new ArrayList();
    double restmoney = 1000;

    @Override
    public void newAnimal()throws InsufficientBalanceException {

        System.out.println("输入新动物名称:" + "(1.中华田园犬 2.波斯猫 3.小仓鼠)");
        Scanner sc = new Scanner(System.in);
        int add = sc.nextInt();
        if (add == 1) {
            ma.add("中华田园犬");
            restmoney = restmoney - 200;
        } else if (add == 2) {
            ma.add("波斯猫");
            restmoney = restmoney - 100;
        } else if (add == 3) {
            ma.add("小仓鼠");
            restmoney = restmoney - 50;
        }


        for (int x = 0; x < ma.size(); x++) {
            System.out.println(ma.get(x));
        }
        if(restmoney<=0){
            throw new InsufficientBalanceException("钱用光了");

        }
    }

    ;

    public void helloCustomer() throws AnimalNotFountException {
        System.out.println("欢迎来到宠物店");
        System.out.println("输入顾客名字");
        Scanner sc1 = new Scanner(System.in);
        String add = sc1.nextLine();
        cu.add(add);
        for (int x = 0; x < cu.size(); x++) {
            System.out.println(cu.get(x));
        }
        if(cu.get(0).equals("")){
            throw new AnimalNotFountException("没有动物");

        }

    }

    ;

    public void xieYe() {


    }




}

     class InsufficientBalanceException extends Exception{
         public InsufficientBalanceException() {
         }

         public InsufficientBalanceException(String message) {
             super(message);
         }
     }
     class AnimalNotFountException extends Exception{
         public AnimalNotFountException() {

         }

         public AnimalNotFountException(String message) {
             super(message);
         }
     }