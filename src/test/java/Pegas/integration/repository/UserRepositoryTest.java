package Pegas.integration.repository;

import Pegas.ApplicationRunnerHw;
import Pegas.seminar2.hw2.entity.User;
import Pegas.seminar2.hw2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ApplicationRunnerHw.class)
@RequiredArgsConstructor
@Transactional
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
public class UserRepositoryTest {
    private final UserRepository userRepository;

    @Test
    void findById(){
        var users = userRepository.findById(1);
        assertTrue(!users.isEmpty());
    }
    @Test
    void findAll(){
        List<User> users = userRepository.findAll();
        assertTrue(!users.isEmpty());
        assertThat(users).hasSize(4);
    }
    @Test
    void save(){
        var user = User.builder()
                .firstName("ad")
                .lastName("adasd")
                .build();
        userRepository.save(user);
        assertNotNull(user.getId());
    }
    @Test
    void delete(){
        Optional<User> company = userRepository.findById(4);
        assertTrue(company.isPresent());
        company.ifPresent(userRepository::delete);
        userRepository.flush();
        assertTrue(userRepository.findById(4).isEmpty());
    }

}
