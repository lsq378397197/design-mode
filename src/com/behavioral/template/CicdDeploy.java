package com.behavioral.template;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/16 10:05
 */
public class CicdDeploy extends DeployFlowTemplate {
    @Override
    void buildPackage() {
        System.out.println("cicd 自动打包");
    }

    @Override
    void buildDokcerImage() {
        System.out.println("cicd 自动构建docker镜像");
    }

    @Override
    void unitTest() {
        System.out.println("cicd 自动单元测试");
    }
}
