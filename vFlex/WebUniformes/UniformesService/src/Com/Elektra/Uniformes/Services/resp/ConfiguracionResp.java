package Com.Elektra.Uniformes.Services.resp;

import java.util.Map;

public class ConfiguracionResp extends ServiceResponse {
    private Map<String, String> config;

    public Map<String, String> getConfig() {
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }
}
