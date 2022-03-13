package top.liph.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.liph.mall.common.utils.PageUtils;
import top.liph.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu??Ϣ???
 *
 * @author lipenghui
 * @email henulph@qq.com
 * @date 2022-03-13 18:27:18
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

