package com.behavioral.template;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/10 22:16
 */
public class Client {
    public static void main(String[] args) {
        LocalDeploy localDeploy = new LocalDeploy();
        localDeploy.startFlow();
        System.out.println("=========================================");
        CicdDeploy cicdDeploy = new CicdDeploy();
        cicdDeploy.startFlow();
    }
}
