package com.drrr.domain.log.repository;

import com.drrr.domain.log.entity.history.MemberPostHistory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberPostHistoryRepository extends JpaRepository<MemberPostHistory, Long> {
    List<MemberPostHistory> findByMemberId(Long memberId);
}
