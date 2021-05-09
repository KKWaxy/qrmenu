package com.qrmenu.qrmenuapp.api;

import com.qrmenu.qrmenuapp.models.Menu;
import com.qrmenu.qrmenuapp.services.MenuService;
import com.qrmenu.qrmenuapp.utils.qrmenuexceptions.ObjectDoesExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@RestController
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/all/")
    public List<Menu> allMenu(){
        return this.menuService.getAllMenu();
    }

    @PostMapping("/newMenu/")
    public Menu newMenu(@RequestBody Menu menu) throws ObjectDoesExists {
        return this.menuService.addMenu(menu);
    }

    @DeleteMapping("/{menuId}/")
    public void delMenuById(@PathVariable("menuId")UUID menuId){
        this.menuService.deleteMenuById(menuId);
    }

    @DeleteMapping("/remove-all/")
    public void deleteAll(){
        this.menuService.deleteAll();
    }

}
