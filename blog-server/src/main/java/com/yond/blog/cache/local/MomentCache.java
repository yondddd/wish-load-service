package com.yond.blog.cache.local;

import com.github.benmanes.caffeine.cache.Cache;
import com.yond.blog.entity.MomentDO;

import java.util.List;

/**
 * @Author Yond
 * @date 8/31/2024
 * @description
 */
public class MomentCache {

    private final static String KEY = "allMoment";

    private final static Cache<String, List<MomentDO>> cache = LocalCache.buildCache(1);

    public static List<MomentDO> get() {
        return cache.getIfPresent(KEY);
    }

    public static void set(List<MomentDO> data) {
        cache.put(KEY, data);
    }

    public static void del() {
        cache.invalidate(KEY);
    }

}
