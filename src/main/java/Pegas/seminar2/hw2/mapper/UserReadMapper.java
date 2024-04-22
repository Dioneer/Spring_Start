package Pegas.seminar2.hw2.mapper;

import Pegas.seminar2.hw2.DTO.UserReadDTO;
import Pegas.seminar2.hw2.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserReadMapper implements Mapper<User, UserReadDTO>{
    @Override
    public UserReadDTO fromTo(User from) {
        return new UserReadDTO(from.getId(), from.getFirstName(), from.getLastName());
    }
}
