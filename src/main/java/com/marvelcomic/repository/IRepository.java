package com.marvelcomic.repository;

public interface IRepository<T> {

    /**
     * Given an id, returns the entity of the requested item
     * @param id
     * @return T
     */
    T get(String id);
}
