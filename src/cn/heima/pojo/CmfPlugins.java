package cn.heima.pojo;

public class CmfPlugins {
    private Integer id;

    private String name;

    private String title;

    private Byte type;

    private Boolean status;

    private String hooks;

    private Byte hasAdmin;

    private String author;

    private String version;

    private Integer createtime;

    private Short listorder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getHooks() {
        return hooks;
    }

    public void setHooks(String hooks) {
        this.hooks = hooks == null ? null : hooks.trim();
    }

    public Byte getHasAdmin() {
        return hasAdmin;
    }

    public void setHasAdmin(Byte hasAdmin) {
        this.hasAdmin = hasAdmin;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Short getListorder() {
        return listorder;
    }

    public void setListorder(Short listorder) {
        this.listorder = listorder;
    }
}