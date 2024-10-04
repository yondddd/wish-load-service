package com.wish.blog.service;

import com.wish.blog.entity.CommentDO;
import com.wish.blog.web.admin.dto.CommentDTO;
import com.wish.common.enums.CommentOpenStateEnum;
import com.wish.common.enums.CommentPageEnum;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public interface CommentService {

    List<CommentDO> listAll();

    Pair<Integer, List<CommentDTO>> pageBy(CommentPageEnum page, Long blogId, Integer pageNo, Integer pageSize);

    CommentDO getById(Long id);

    void updateSelective(CommentDO comment);

    void insertSelective(CommentDO comment);

    CommentOpenStateEnum getPageCommentStatus(Integer page, Long blogId);

    Pair<Integer, List<CommentDTO>> viewPageBy(Integer page, Long blogId, Integer pageNo, Integer pageSize);
}
