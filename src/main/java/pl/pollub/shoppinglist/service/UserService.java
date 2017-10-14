package pl.pollub.shoppinglist.service;

import pl.pollub.shoppinglist.model.User;

import java.util.List;

/**
 * @author Adrian
 * @since 2017-10-14
 */
public interface UserService {
    User saveOrUpdate(User user);
    User findById(Long id);
    List<User> findAll();
    void delete(Long id);
    void delete(User user);
}
