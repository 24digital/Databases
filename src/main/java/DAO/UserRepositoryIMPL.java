package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Marion on 8/14/2014.
 */
@Repository

@Service
public class UserRepositoryIMPL {
    @PersistenceContext
    EntityManager emf;

    @Autowired
    UserRepository userRepository;


}

