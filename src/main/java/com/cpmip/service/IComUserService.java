package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.ComUser;

public interface IComUserService {

    ServerResponse login(String username, String password);

    ServerResponse register(ComUser user);

    ServerResponse<String> checkValid(String str, String type);
}
