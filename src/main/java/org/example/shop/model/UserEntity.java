package org.example.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity()
@Inheritance(strategy = InheritanceType.JOINED)
public class UserEntity {
//    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;

    @Column(unique = true)
    private String username;

    @Column
    private String surname;

    @Column
//    @Email
    private String email;

    @Column
    private String password;

    @Column
    @Enumerated(EnumType.STRING)
    private Role role;

    public Role getRole() {
        return role;
    }
}
