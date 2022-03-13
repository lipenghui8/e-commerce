package top.liph.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.liph.mall.common.utils.PageUtils;
import top.liph.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * ??Ʒ???????
 *
 * @author lipenghui
 * @email henulph@qq.com
 * @date 2022-03-13 18:27:17
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

