package pl.pollub.shoppinglist.model;

import lombok.*;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Adrian
 * @since 2017-10-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass
public abstract class NamedEntity extends BaseEntity {
    @NotNull
    @Size(min = 3, max = 255)
    private String name;
}
