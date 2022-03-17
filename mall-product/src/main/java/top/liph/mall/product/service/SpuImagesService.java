package top.liph.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.liph.mall.common.utils.PageUtils;
import top.liph.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author lipenghui
 * @email henulph@qq.com
 * @date 2022-03-17 21:13:43
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

