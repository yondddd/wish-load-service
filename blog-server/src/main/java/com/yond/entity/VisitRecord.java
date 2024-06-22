package com.yond.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description: 访问记录
 * @Author: Naccl
 * @Date: 2021-02-23
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VisitRecord implements Serializable {
    @Serial
    private static final long serialVersionUID = -8699975183423734099L;
    private Long id;
    private Integer pv;//访问量
    private Integer uv;//独立用户
    private String date;//日期"02-23"

    public VisitRecord(Integer pv, Integer uv, String date) {
        this.pv = pv;
        this.uv = uv;
        this.date = date;
    }
}
