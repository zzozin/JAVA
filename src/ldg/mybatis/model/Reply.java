package ldg.mybatis.model;

import java.io.Serializable; 
import java.util.Date;

public class Reply implements Serializable {

	private int replyNo;

	public int getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}
	public String getCommnetNo() {
		return commnetNo;
	}
	public void setCommnetNo(String commnetNo) {
		this.commnetNo = commnetNo;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	private String commnetNo;
	private String userid;
	private String replyContent;
	private Date regDate;

}
