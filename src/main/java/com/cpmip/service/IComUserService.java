package com.cpmip.service;

import com.cpmip.common.ServerResponse;

public interface IComUserService {

    ServerResponse login(String username, String password);
}
