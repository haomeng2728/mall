package zju.hm.mall.dao;

import org.apache.ibatis.annotations.Param;
import zju.hm.mall.nosql.elasticsearch.document.EsProduct;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * Created by macro on 2018/6/19.
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
