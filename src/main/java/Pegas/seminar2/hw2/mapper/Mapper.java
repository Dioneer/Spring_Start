package Pegas.seminar2.hw2.mapper;

public interface Mapper<E, T>{
    T fromTo(E from);
}
