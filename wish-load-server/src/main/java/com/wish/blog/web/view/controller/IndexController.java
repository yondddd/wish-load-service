package com.wish.blog.web.view.controller;

import com.wish.blog.entity.CategoryDO;
import com.wish.blog.entity.SiteConfigDO;
import com.wish.blog.entity.TagDO;
import com.wish.blog.service.BlogService;
import com.wish.blog.service.CategoryService;
import com.wish.blog.service.SiteConfigService;
import com.wish.blog.service.TagService;
import com.wish.blog.web.view.vo.IndexVO;
import com.wish.blog.web.view.vo.NewBlogVO;
import com.wish.blog.web.view.vo.RandomBlogVO;
import com.wish.common.enums.SiteConfigTypeEnum;
import com.wish.common.resp.Response;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 站点相关
 * @Author: Yond
 */
@RestController
@RequestMapping("/view/index")
public class IndexController {
    
    @Resource
    private SiteConfigService siteConfigService;
    @Resource
    private BlogService blogService;
    @Resource
    private CategoryService categoryService;
    @Resource
    private TagService tagService;
    
    /**
     * 获取站点配置信息、最新推荐博客、分类列表、标签云、随机博客
     */
    @GetMapping("/site")
    public Response<IndexVO> site() {
        IndexVO data = new IndexVO();
        Map<String, String> map = new HashMap<>();
        List<SiteConfigDO> all = siteConfigService.listAll();
        for (SiteConfigDO c : all) {
            if (!SiteConfigTypeEnum.THIRD_PARTY_KEY.getVal().equals(c.getType())) {
                map.put(c.getKey(), c.getValue());
            }
        }
        data.setConfig(map);
        List<NewBlogVO> newBlogVOList = blogService.listNewBlog();
        List<RandomBlogVO> randomBlogVOList = blogService.listRandomBlog();
        List<CategoryDO> categoryList = categoryService.listAll();
        List<TagDO> tagList = tagService.listAll();
        data.setNewBlogList(newBlogVOList);
        data.setRandomBlogList(randomBlogVOList);
        data.setCategoryList(categoryList);
        data.setTagList(tagList);
        return Response.success(data);
    }
    
}
