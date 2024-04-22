package Pegas.seminar2.hw2.repository;

import Pegas.seminar2.hw2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

}
