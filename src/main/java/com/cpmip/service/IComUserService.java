package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.ComUser;

public interface IComUserService {

    public ServerResponse login(String username, String password);

    public ServerResponse register(ComUser user);

    public ServerResponse<String> checkValid(String str, String type);

    public ServerResponse getUserInfo(Integer id);
}
