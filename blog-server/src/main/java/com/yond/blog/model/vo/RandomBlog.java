package com.yond.blog.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 随机博客
 * @Author: Naccl
 * @Date: 2020-08-17
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RandomBlog implements Serializable {
    @Serial
    private static final long serialVersionUID = -9109899710786987182L;
    private Long id;
    private String title;//文章标题
    private String firstPicture;//文章首图，用于随机文章展示
    private Date createTime;//创建时间
    private String password;//文章密码
    private Boolean privacy;//是否私密文章
}
