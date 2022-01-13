package com.behavioral.chain;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/13 22:34
 */
public class Request {
    private String requestMsg;

    public Request(String requestMsg) {
        this.requestMsg = requestMsg;
    }

    public String getRequestMsg() {
        return requestMsg;
    }

    public void setRequestMsg(String requestMsg) {
        this.requestMsg = requestMsg;
    }
}
