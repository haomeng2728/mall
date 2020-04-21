package zju.hm.mall.nosql.elasticsearch.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import zju.hm.mall.nosql.elasticsearch.document.EsProduct;

/**
 * 商品ES操作类
 */
public interface EsProductRepository extends ElasticsearchRepository {

    /**
     * 搜索查询
     * @param name
     * @param subTitle
     * @param keywords
     * @param page
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}
