package com.imooc.service;

public interface IUserService {
    /*判断用户是否存在*/
    public boolean queryUsernameIsExist(String username);

    public void saveParent();

    public void saveChild();
}
