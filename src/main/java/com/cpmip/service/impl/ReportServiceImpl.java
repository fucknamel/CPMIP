package com.cpmip.service.impl;

import com.cpmip.common.ServerResponse;
import com.cpmip.dao.ReportMapper;
import com.cpmip.pojo.Report;
import com.cpmip.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iReportService")
public class ReportServiceImpl implements IReportService {

    @Autowired
    private ReportMapper reportMapper;

    public ServerResponse add(Report item){
        int resultCount = reportMapper.insert(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    public ServerResponse deleteById(Integer id){
        int resultCount = reportMapper.deleteByPrimaryKey(id);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }
}
