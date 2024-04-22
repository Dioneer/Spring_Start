package Pegas.seminar2.hw2.mapper;

import Pegas.seminar2.hw2.DTO.UserCreateUpdateDTO;
import Pegas.seminar2.hw2.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserCreateUpdateMapper implements Mapper<UserCreateUpdateDTO, User>{
    @Override
    public User fromTo(UserCreateUpdateDTO from) {
        return User.builder()
                .firstName(from.getFirstName())
                .lastName(from.getLastName())
                .build();
    }
    public User fromTo(UserCreateUpdateDTO from, User to){
        to.setFirstName(from.getFirstName());
        to.setLastName(from.getLastName());
        return to;
    }
}
