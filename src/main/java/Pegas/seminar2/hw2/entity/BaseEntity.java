package Pegas.seminar2.hw2.entity;

import java.io.Serializable;

public interface BaseEntity<T extends Serializable> {
    void setId(T id);
    T getId ();
}
