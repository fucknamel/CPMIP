package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Report;

public interface IReportService {

    public ServerResponse add(Report item);
}
