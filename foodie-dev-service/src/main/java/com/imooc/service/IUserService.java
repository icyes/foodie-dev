package com.imooc.service;

import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

public interface IUserService {
    /*判断用户是否存在*/
    public boolean queryUsernameIsExist(String username);

    public Users createUser(UserBO userBO);

    public void saveParent();

    public void saveChild();
}
