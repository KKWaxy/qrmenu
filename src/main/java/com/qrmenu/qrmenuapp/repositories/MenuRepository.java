package com.qrmenu.qrmenuapp.repositories;

import com.qrmenu.qrmenuapp.models.Menu;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface MenuRepository extends MongoRepository<Menu,UUID> {


    Optional<Menu> findByMenuID(UUID menuID);

    @Override
    List<Menu> findAll();

    @Override
    <S extends Menu> S insert(S s);

    @Override
    Page<Menu> findAll(Pageable pageable);

    @Override
    Optional<Menu> findById(UUID uuid);

    @Override
    void delete(Menu menu);

    @Override
    void deleteById(UUID uuid);

    @Override
    void deleteAll();

    @Override
    void deleteAll(Iterable<? extends Menu> iterable);

    @Override
    boolean existsById(UUID uuid);

    @Override
    <S extends Menu> S save(S s);
}
