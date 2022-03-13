package top.liph.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.liph.mall.common.utils.PageUtils;
import top.liph.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku????????&ֵ
 *
 * @author lipenghui
 * @email henulph@qq.com
 * @date 2022-03-13 18:27:17
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

