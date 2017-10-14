package pl.pollub.shoppinglist.model.repository;

import pl.pollub.shoppinglist.model.User;

/**
 * @author Adrian
 * @since 2017-10-14
 */
public interface UserRepository extends BaseRepository<User, Long> {
    User findByName(String userName);
}
