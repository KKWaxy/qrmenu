package com.qrmenu.qrmenuapp.services;

import com.qrmenu.qrmenuapp.models.Menu;
import com.qrmenu.qrmenuapp.repositories.MenuRepository;
import com.qrmenu.qrmenuapp.utils.constants.qrmenuexceptions.Exists;
import com.qrmenu.qrmenuapp.utils.constants.qrmenuexceptions.ObjectDoesExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public void addMenu(Menu menu) throws ObjectDoesExists {

        if(menu.getMenuID() == null || !this.menuRepository.existsById(menu.getMenuID())){
            menu.setMenuID(UUID.randomUUID());
            this.menuRepository.save(menu);
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
            throw new Exists(menu.toString()+"Does not exist.");
        }
        this.menuRepository.save(menu);
    }

    public void deleteMenuById(UUID menuId){
        if(menuId != null){
            this.menuRepository.deleteById(menuId);
        }else {

        }
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
}
