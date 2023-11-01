package com.example.race;

import com.example.race.domain.Role;
import com.example.race.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class RaceApplicationTests {
    @Autowired
    RoleService roleService;

    @Test
    void contextLoads() {
        List<Role> list = roleService.list();
        list.forEach(System.out::println);
        Assert.notNull(list,"list is null");
    }

}
