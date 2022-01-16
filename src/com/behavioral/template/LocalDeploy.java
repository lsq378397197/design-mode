package com.behavioral.template;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/16 10:04
 */
public class LocalDeploy extends DeployFlowTemplate {
    @Override
    void buildPackage() {
        System.out.println("本地打包");
    }

    @Override
    void buildDokcerImage() {
        System.out.println("本地构建docker镜像");
    }

    @Override
    void unitTest() {
        System.out.println("本地单元测试");
    }
}
