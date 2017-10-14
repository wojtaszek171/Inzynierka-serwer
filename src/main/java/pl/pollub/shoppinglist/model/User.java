package pl.pollub.shoppinglist.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

/**
 * @author Adrian
 * @since 2017-10-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class User extends NamedEntity {
    @NotNull
    @Size(min = 6, max = 255)
    private String password;
    @NotNull
    @Size(min = 6, max = 255)
    private String email;
    @ManyToMany
    @JoinColumn
    private List<Role> roles;

    public List<Role> getRoles() {
        return Collections.unmodifiableList(roles);
    }
}
