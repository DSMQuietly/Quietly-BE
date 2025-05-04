package pjimin.quietly.domain.user.entity;

import jakarta.persistence.*;
import lombok.*;
import pjimin.quietly.domain.concern.entity.Concern;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String accountId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String major;

    @Column(nullable = false)
    private String profileImage;

    @OneToMany(mappedBy = "user")
    private List<Concern> concerns;
}
