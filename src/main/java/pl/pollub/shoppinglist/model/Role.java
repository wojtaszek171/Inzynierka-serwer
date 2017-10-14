package pl.pollub.shoppinglist.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collections;
import java.util.List;

/**
 * @author Adrian
 * @since 2017-10-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
public class Role extends BaseEntity {
    @NotNull
    @Size(min = 3, max = 255)
    private String name;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private List<User> users;
    @ManyToMany
    @JoinColumn
    private List<Privilege> privileges;

    public List<Privilege> getPrivileges() {
        return Collections.unmodifiableList(privileges);
    }
}
