package net.fuzui.StudentInfo.service.impl;

import net.fuzui.StudentInfo.mapper.SelectCourseMapper;
import net.fuzui.StudentInfo.pojo.SC;
import net.fuzui.StudentInfo.pojo.StuExitSelect;
import net.fuzui.StudentInfo.pojo.StuSelectResult;
import net.fuzui.StudentInfo.pojo.Student;
import net.fuzui.StudentInfo.service.SelectCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.service.impl
 * @ClassName: SelectCourseServiceImpl
 * @Description: 选课service具体实现类
 */
@Service
public class SelectCourseServiceImpl implements SelectCourseService {

    @Autowired
    private SelectCourseMapper selectCourseMapper;

    /**
     * 选课
     * @return  选课结果
     */
    @Override
    public int selectCourse(String cid, String sid) {
        return selectCourseMapper.selectCourse(cid,sid);
    }

    /**
     * 判断是否加入过此兴趣班
     * @param cid   兴趣班编号
     * @param sid   学号
     * @return
     */
    @Override
    public String existCourse(String cid, String sid) {
        return selectCourseMapper.existCourse(cid,sid);
    }

    /**
     * 查询全部
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    @Override
    public List<SC> getAllSC(int pageNo, int pageSize, String sid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return selectCourseMapper.getAllSC(data);
    }

    /**
     * 根据兴趣班编号查询兴趣班选课信息
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param cid       兴趣班编号
     * @return  查询结果
     */
    @Override
    public List<SC> getSCByCid(int pageNo, int pageSize, String cid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("cid",cid);
        return selectCourseMapper.getSCByCid(data);
    }

    /**
     * 根据学号查询本人已选兴趣班
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    @Override
    public List<StuSelectResult> getSCBySid(int pageNo, int pageSize, String sid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return selectCourseMapper.getSCBySid(data);
    }

    /**
     * 根据学号退选（待确定··）
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    @Override
    public List<StuExitSelect> getExitBysid(int pageNo, int pageSize, String sid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return selectCourseMapper.getExitBysid(data);
    }

    /**
     * 退选
     * @param cid
     * @return
     */
    @Override
    public int deleteSC(String cid,String sid) {
        return selectCourseMapper.deleteSC(cid,sid);
    }

    /**
     * 查看兴趣班已选人数
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param tid       教师编号
     * @return
     */
    @Override
    public List<StuExitSelect> getLookByTid(int pageNo, int pageSize, String tid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("tid",tid);
        return selectCourseMapper.getLookByTid(data);
    }

    /**
     * 查看兴趣班的学生详细信息
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param cid       兴趣班编号
     * @return
     */
    @Override
    public List<Student> getByStuSid(int pageNo, int pageSize, String cid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("cid",cid);
        return selectCourseMapper.getByStuSid(data);
    }
}
