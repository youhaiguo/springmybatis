package com.you.springmybatis.entity;

public class MenuInfo {
//    CREATE TABLE `menuinfo` (
//            `MENUID` int(11) NOT NULL AUTO_INCREMENT,
//  `MENUNAME` varchar(30) DEFAULT NULL,
//  `MENU_URL` varchar(255) DEFAULT NULL,
//  `MENUICON` varchar(255) DEFAULT NULL,
//  `PARENTID` int(11) DEFAULT NULL COMMENT 'ظӋեID',
//    PRIMARY KEY (`MENUID`)
//) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Ӌեҭ'

    private int menuId;
    private String menuName;
    private String menuUrl;
    private String menuIcon;
    private int parentId;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
