package com.cpmip.service.impl;

import com.cpmip.common.Const;
import com.cpmip.common.ServerResponse;
import com.cpmip.dao.ReportMapper;
import com.cpmip.pojo.Report;
import com.cpmip.service.IReportService;
import com.cpmip.util.DateTimeUtil;
import com.cpmip.vo.ReportListVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    public ServerResponse changeById(Report item){
        int resultCount = reportMapper.updateByPrimaryKeySelective(item);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    public ServerResponse getList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Report> reportList = reportMapper.selectList();

        List<ReportListVo> reportListVoList = Lists.newArrayList();
        for (Report report : reportList){
            ReportListVo reportListVo = assembleReportListVo(report);
            reportListVoList.add(reportListVo);
        }
        PageInfo pageResult = new PageInfo(reportList);
        pageResult.setList(reportListVoList);

        return ServerResponse.createBySuccess(pageResult);
    }

    private ReportListVo assembleReportListVo(Report item){
        ReportListVo reportListVo = new ReportListVo();
        reportListVo.setId(item.getId());
        reportListVo.setConstruname(item.getConstruname());
        reportListVo.setPosition(item.getPosition());
        reportListVo.setBuildname(item.getBuildname());
        reportListVo.setConstruction(item.getConstruction());

        return reportListVo;
    }
}
