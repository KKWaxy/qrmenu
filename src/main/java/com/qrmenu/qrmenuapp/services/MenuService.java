package com.qrmenu.qrmenuapp.services;

import com.qrmenu.qrmenuapp.models.Menu;
import com.qrmenu.qrmenuapp.repositories.MenuRepository;
import com.qrmenu.qrmenuapp.utils.qrmenuexceptions.Exists;
import com.qrmenu.qrmenuapp.utils.qrmenuexceptions.ObjectDoesExists;
import com.qrmenu.qrmenuapp.utils.qrmenuexceptions.QrMenuObjectNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Menu addMenu(Menu menu) throws ObjectDoesExists {

        if(menu.getMenuID() == null || !this.menuRepository.existsById(menu.getMenuID())){
            menu.setMenuID(UUID.randomUUID());
            menu.setTimestamp(Date.from(Instant.now()));
            menu.setTimestamp(Date.from(Instant.now()));
            menu.setLastModifiedTime(menu.getTimestamp());

            return this.menuRepository.save(menu);
        }else{
            throw new  ObjectDoesExists(menu);
        }

    }

    public List<Menu> getAllMenu(){
        return this.menuRepository.findAll();
    }

    public Menu getMenuById(UUID menuId){
        return this.menuRepository.findByMenuID(menuId)
                .orElse(null);
    }

    public void modifiedMenu(Menu menu) throws Exists {
        if(this.getMenuById(menu.getMenuID())==null){
            throw new QrMenuObjectNotExistException();
        }
        this.menuRepository.save(menu);
    }

    public void deleteMenuById(UUID menuId){
        this.menuRepository.deleteById(menuId);
    }

    public void deleteMenu(Menu menu){
        this.menuRepository.delete(menu);
    }
    public int deleteAllMenu(){
        this.menuRepository.deleteAll();
        return 0;
    }

    public void deleteAllMenu(List<Menu> menus){
        this.menuRepository.deleteAll(menus);
    }

    public int addAll(List<Menu> menus){
        this.menuRepository.saveAll(menus);
        return 0;
    }

    public void deleteAll(){
        this.menuRepository.deleteAll();
    }
}
