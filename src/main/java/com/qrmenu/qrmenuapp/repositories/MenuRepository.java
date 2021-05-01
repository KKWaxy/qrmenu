package com.qrmenu.qrmenuapp.repositories;

import com.qrmenu.qrmenuapp.beans.Menu;
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
}
