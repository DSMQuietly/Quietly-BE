package pjimin.quietly.domain.reply.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import pjimin.quietly.domain.concern.entity.Concern;
import pjimin.quietly.domain.user.entity.User;

import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@Getter
@NoArgsConstructor
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    private Concern concern;

    @ManyToOne
    private User user;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
