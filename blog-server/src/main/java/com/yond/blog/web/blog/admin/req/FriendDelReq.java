package com.yond.blog.web.blog.admin.req;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description:
 * @Author: Yond
 * @Date: 2024-09-14
 */
public class FriendDelReq implements Serializable {

    @Serial
    private static final long serialVersionUID = 6071813598305776921L;

    private Long id;

    public Long getId() {
        return id;
    }

    public FriendDelReq setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "FriendDelReq{" +
                "id=" + id +
                '}';
    }
}
