package net.fuzui.StudentInfo.pojo;
/**
* @ProjectName:	StudentInfo
* @Package: net.fuzui.StudentInfo.pojo
* @ClassName: Student
* @Description: 学生实体类
 */

public class Student implements java.io.Serializable{

	//序列化
	private static final long serialVersionUID = 1L;
	//学号
	private String sid;
	//姓名
	private String sname;
	//身份证号
	private String sidcard;
	//性别
	private String ssex;
	//密码
	private String spassword;
	//年龄
	private String sage;

	
	/**
	 *	默认构造方法
	 * */
	public Student() {
		
	}
	
	
	/**
	 * 置取方法
	 * */
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSidcard() {
		return sidcard;
	}
	public void setSidcard(String sidcard) {
		this.sidcard = sidcard;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getSage() {
		return sage;
	}
	public void setSage(String sage) {
		this.sage = sage;
	}

	
}
