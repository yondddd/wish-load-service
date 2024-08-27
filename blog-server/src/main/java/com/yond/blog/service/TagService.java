package com.yond.blog.service;

import com.yond.blog.entity.TagDO;
import com.yond.blog.web.blog.view.vo.TagBlogCount;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public interface TagService {

    List<TagDO> listAll();

    List<TagDO> listByIds(List<Long> ids);

    Pair<Integer, List<TagDO>> page(Integer pageNo, Integer pageSize);

    List<TagDO> getTagListByBlogId(Long blogId);

    void saveTag(TagDO tag);

    TagDO getTagByName(String name);

    void deleteTagById(Long id);

    void updateTag(TagDO tag);

    List<TagBlogCount> getTagBlogCount();
    
    Long insertSelective(TagDO tag);
    
    Long saveIfAbsent(TagDO tag);
}
