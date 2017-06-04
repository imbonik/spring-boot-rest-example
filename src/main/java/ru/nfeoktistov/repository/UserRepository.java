package ru.nfeoktistov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nfeoktistov.entity.User;


/**
 * Created by lat-fs on 6/3/2017.
 */


@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
