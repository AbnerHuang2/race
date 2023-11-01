package com.example.race.controller;

import com.example.race.domain.Role;
import com.example.race.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author skitii
 * @since 2023/11/01
 **/
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/list")
    public List<Role> getRoleList() {
        return roleService.list();
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Role role) {
        return roleService.save(role);
    }

    @PostMapping("/update")
    public boolean update(@RequestBody Role role) {
        return roleService.updateById(role);
    }

    @PostMapping("/delete")
    public boolean delete(Integer id) {
        return roleService.removeById(id);
    }

}
