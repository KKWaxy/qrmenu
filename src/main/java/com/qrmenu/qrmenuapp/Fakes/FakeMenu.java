package com.qrmenu.qrmenuapp.Fakes;

import com.qrmenu.qrmenuapp.beans.Menu;
import com.qrmenu.qrmenuapp.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class FakeMenu implements CommandLineRunner {

    private final MenuRepository menuRepository;

    @Autowired
    public FakeMenu(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Menu menu1 = new Menu(UUID.randomUUID(),"Fotou bien fait !");
        this.menuRepository.save(menu1);

    }
}
