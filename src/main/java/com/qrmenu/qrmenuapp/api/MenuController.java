package com.qrmenu.qrmenuapp.api;

import com.qrmenu.qrmenuapp.models.Menu;
import com.qrmenu.qrmenuapp.services.MenuService;
import com.qrmenu.qrmenuapp.utils.qrmenuexceptions.ObjectDoesExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("menu/")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("all/")
    public List<Menu> allMenu(){
        return this.menuService.getAllMenu();
    }

    @PostMapping("/newMenu")
    public void newMenu(@RequestBody Menu menu) throws ObjectDoesExists {
        this.menuService.addMenu(menu);
    }
}
