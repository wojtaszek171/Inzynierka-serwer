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
public class Privilege extends NamedEntity {
    @NotNull
    @Size(min = 3, max = 255)
    private String name;
    @ManyToMany(mappedBy = "privileges")
    private List<Role> roles;

    public List<Role> getRoles() {
        return Collections.unmodifiableList(roles);
    }
}
