package zju.hm.mall.nosql.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zju.hm.mall.nosql.mongodb.ducument.MemberReadHistory;

import java.util.List;

public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {
    /**
     * 根据会员id按时间倒序获取浏览记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
