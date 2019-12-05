package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by zml on 19-12-5.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String categoryName)

}
