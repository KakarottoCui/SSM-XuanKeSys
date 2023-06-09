package net.fuzui.StudentInfo.service;

import net.fuzui.StudentInfo.pojo.SC;
import net.fuzui.StudentInfo.pojo.StuExitSelect;
import net.fuzui.StudentInfo.pojo.StuSelectResult;
import net.fuzui.StudentInfo.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.service
 * @ClassName: SelectCourseService
 * @Description: 选课service接口层
 */

public interface SelectCourseService {

    /**
     * 选课
     * @return  选课结果
     */
    public int selectCourse(String cid, String sid);

    /**
     * 判断是否加入过此兴趣班
     * @param cid   兴趣班编号
     * @param sid   学号
     * @return
     */
    public String existCourse(String cid, String sid);

    /**
     * 查询全部
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    public List<SC> getAllSC(int pageNo, int pageSize, String sid);

    /**
     * 根据兴趣班编号查询兴趣班选课信息
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param cid       兴趣班编号
     * @return  查询结果
     */
    public List<SC> getSCByCid(int pageNo, int pageSize, String cid);

    /**
     * 根据学号查询本人已选兴趣班
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    public List<StuSelectResult> getSCBySid(int pageNo, int pageSize, String sid);

    /**
     * 根据学号退选（待确定··）
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    public List<StuExitSelect> getExitBysid(int pageNo, int pageSize, String sid);

    /**
     * 退选
     * @param cid
     * @return
     */
    public int deleteSC(String cid,String sid);

    /**
     * 查看兴趣班已选人数
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param tid       教师编号
     * @return
     */
    public List<StuExitSelect> getLookByTid(int pageNo, int pageSize, String tid);

    /**
     * 查看兴趣班的学生详细信息
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param cid       兴趣班编号
     * @return
     */
    public List<Student> getByStuSid(int pageNo, int pageSize, String cid);

}
