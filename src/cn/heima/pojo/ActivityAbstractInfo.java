package cn.heima.pojo;

import java.util.Date;

public class ActivityAbstractInfo {
    private Integer id;

    private String actiName;

    private String actiAddr;

    private String actiAge;

    private Date actiStarttime;

    private Date actiEndtime;

    private Date actiShipdate;

    private String actiParentchildInd;

    private String actiFeatureDesc;

    private Double actiPrice;

    private String actiAbsPic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActiName() {
        return actiName;
    }

    public void setActiName(String actiName) {
        this.actiName = actiName == null ? null : actiName.trim();
    }

    public String getActiAddr() {
        return actiAddr;
    }

    public void setActiAddr(String actiAddr) {
        this.actiAddr = actiAddr == null ? null : actiAddr.trim();
    }

    public String getActiAge() {
        return actiAge;
    }

    public void setActiAge(String actiAge) {
        this.actiAge = actiAge == null ? null : actiAge.trim();
    }

    public Date getActiStarttime() {
        return actiStarttime;
    }

    public void setActiStarttime(Date actiStarttime) {
        this.actiStarttime = actiStarttime;
    }

    public Date getActiEndtime() {
        return actiEndtime;
    }

    public void setActiEndtime(Date actiEndtime) {
        this.actiEndtime = actiEndtime;
    }

    public Date getActiShipdate() {
        return actiShipdate;
    }

    public void setActiShipdate(Date actiShipdate) {
        this.actiShipdate = actiShipdate;
    }

    public String getActiParentchildInd() {
        return actiParentchildInd;
    }

    public void setActiParentchildInd(String actiParentchildInd) {
        this.actiParentchildInd = actiParentchildInd == null ? null : actiParentchildInd.trim();
    }

    public String getActiFeatureDesc() {
        return actiFeatureDesc;
    }

    public void setActiFeatureDesc(String actiFeatureDesc) {
        this.actiFeatureDesc = actiFeatureDesc == null ? null : actiFeatureDesc.trim();
    }

    public Double getActiPrice() {
        return actiPrice;
    }

    public void setActiPrice(Double actiPrice) {
        this.actiPrice = actiPrice;
    }

    public String getActiAbsPic() {
        return actiAbsPic;
    }

    public void setActiAbsPic(String actiAbsPic) {
        this.actiAbsPic = actiAbsPic == null ? null : actiAbsPic.trim();
    }
}