package com.drrr.domain.log.entity.post;

import com.drrr.domain.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "DRRR_MEMBER_POST_LOG")
@PrimaryKeyJoinColumn(name = "MEMBER_POST_LOG")
public class MemberPostLog extends BaseEntity {
    private Long memberId;
    private Long postId;
    private boolean isRead;
    private boolean isRecommended;

    public void updateRecommendStatus() {
        this.isRecommended = true;
    }

}
