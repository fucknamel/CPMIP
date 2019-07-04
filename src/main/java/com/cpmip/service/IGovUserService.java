package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.GovUser;

public interface IGovUserService {

    public ServerResponse login(String jobId, String password);

    public ServerResponse register(GovUser user);
}
