package com.structural.decoration;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:27
 */
public class Client {
    public static void main(String[] args) {
        Pancake basePancake = new BasePancake();
        System.out.println(basePancake.getMsg()+"的价格是"+basePancake.getPrice());

        //加一片生菜
        BaseDecorator addLettuce = new LettuceDecorator(basePancake);
        System.out.println(addLettuce.getMsg()+"的价格是"+addLettuce.getPrice());

        //加生菜并且加鸡蛋
        BaseDecorator addEggAndLettuce = new EggDecorator(addLettuce);
        System.out.println(addEggAndLettuce.getMsg()+"的价格是"+addEggAndLettuce.getPrice());
    }
}
