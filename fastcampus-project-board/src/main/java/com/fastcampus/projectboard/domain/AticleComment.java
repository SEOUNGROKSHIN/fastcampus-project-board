package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class AticleComment {
    private Long id;
    private Aticle article; // 게시글 ID
    private String content; // 본문

    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
