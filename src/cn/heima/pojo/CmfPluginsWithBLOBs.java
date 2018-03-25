package cn.heima.pojo;

public class CmfPluginsWithBLOBs extends CmfPlugins {
    private String description;

    private String config;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}