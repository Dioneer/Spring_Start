package Pegas.seminar2.hw2.service;

import Pegas.seminar2.hw2.DTO.UserCreateUpdateDTO;
import Pegas.seminar2.hw2.DTO.UserReadDTO;
import Pegas.seminar2.hw2.entity.User;
import Pegas.seminar2.hw2.mapper.UserCreateUpdateMapper;
import Pegas.seminar2.hw2.mapper.UserReadMapper;
import Pegas.seminar2.hw2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;
    private final UserCreateUpdateMapper userCreateUpdateMapper;
    private final UserReadMapper userReadMapper;

    public Optional<UserReadDTO> findById(Integer id){
        return userRepository.findById(id).map(userReadMapper::fromTo);
    }

    public List<UserReadDTO> findAll(){
        return userRepository.findAll().stream()
                .map(userReadMapper::fromTo)
                .toList();
    }

    @Transactional
    public boolean delete(Integer id){
        return userRepository.findById(id)
                .map(i->{
                    userRepository.delete(i);
                    userRepository.flush();
                    return  true;
                }).orElse(false);
    }
    @Transactional
    public Optional<UserReadDTO> update(Integer id, UserCreateUpdateDTO user) {
        return userRepository.findById(id)
                .map(i->userCreateUpdateMapper.fromTo(user,new User()))
                .map(userRepository::saveAndFlush)
                .map(userReadMapper::fromTo);
    }
    @Transactional
    public UserReadDTO create(UserCreateUpdateDTO userDto){
        return Optional.of(userDto)
                .map(i->userCreateUpdateMapper.fromTo(userDto,new User()))
                .map(userRepository::save)
                .map(userReadMapper::fromTo)
                .orElseThrow();
    }
}
