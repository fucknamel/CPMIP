package com.cpmip.service;

import com.cpmip.common.ServerResponse;

public interface IGovUserService {

    public ServerResponse login(String jobId, String password);
}
