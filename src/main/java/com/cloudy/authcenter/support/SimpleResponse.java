package com.cloudy.authcenter.support;

import java.io.Serializable;

/**
 * Created by ljy_cloudy on 2018/10/28.
 */
public class SimpleResponse implements Serializable {
    private Object msg;

    public SimpleResponse() {
    }

    public SimpleResponse(Object msg) {
        this.msg = msg;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}
