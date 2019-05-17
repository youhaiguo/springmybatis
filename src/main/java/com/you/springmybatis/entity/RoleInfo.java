package com.you.springmybatis.entity;

import java.util.List;

public class RoleInfo {
    private int id;
    private String roleName;
    private String showName;

    private List<MenuInfo> menuInfoList;

    public List<MenuInfo> getMenuInfoList() {
        return menuInfoList;
    }

    public void setMenuInfoList(List<MenuInfo> menuInfoList) {
        this.menuInfoList = menuInfoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", showName='" + showName + '\'' +
                ", menuInfoList=" + menuInfoList +
                '}';
    }
}
