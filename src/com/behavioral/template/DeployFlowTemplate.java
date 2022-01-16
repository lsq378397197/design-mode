package com.behavioral.template;

/**
 * 持续集成发布系统
 *
 * @author liushangqing
 * @date 2022/1/16 9:58
 */
public abstract class DeployFlowTemplate {
    public final void startFlow() {
        pullCodeFromGitLab();
        buildPackage();
        buildDokcerImage();
        unitTest();
        pulishToTestEnv();
        pulishToPrepareEnv();
    }

    void pullCodeFromGitLab() {
        System.out.println("从gitlab上拉取代码");
    }

    abstract void buildPackage();

    abstract void buildDokcerImage();

    abstract void unitTest();

    void pulishToTestEnv() {
        System.out.println("发布到测试环境");
    }

    void pulishToPrepareEnv() {
        System.out.println("发布到预发布环境");
    }
}
