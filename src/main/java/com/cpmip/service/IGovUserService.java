package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.GovUser;


public interface IGovUserService {

    ServerResponse login(String username, String password);

    ServerResponse register(GovUser user);

    ServerResponse<String> checkValid(String jobId, String type);
}
