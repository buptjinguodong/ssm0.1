package cn.heima.vo;

import cn.heima.pojo.ActivityAbstractInfo;

public class ActivityVo extends ActivityAbstractInfo {
	String svrTpcd;
	
	int limit;
	
	int offset;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getSvrTpcd() {
		return svrTpcd;
	}

	public void setSvrTpcd(String svrTpcd) {
		this.svrTpcd = svrTpcd;
	}
	
	
	
}
