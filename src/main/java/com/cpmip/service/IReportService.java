package com.cpmip.service;

import com.cpmip.common.ServerResponse;
import com.cpmip.pojo.Report;

public interface IReportService {

    public ServerResponse add(Report item);

    public ServerResponse deleteById(Integer id);

    public ServerResponse changeById(Report item);

    public ServerResponse getList(int pageNum, int pageSize);

    public ServerResponse getReportDetail(Integer reportId);
}
