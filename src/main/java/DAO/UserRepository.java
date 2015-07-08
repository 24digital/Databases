package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Marion on 8/14/2014.
 */
@Transactional
@Component
public interface UserRepository<Arthorentity, String extends Serializable> extends JpaRepository<AuthorEntity, String> {
    List findAllUsers();
}
