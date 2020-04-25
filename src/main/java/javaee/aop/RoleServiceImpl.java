package javaee.aop;

import javaee.annotation.Role;

public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("{id = " + role.getId() + ", name = " + role.getName() + "}");
    }
}
