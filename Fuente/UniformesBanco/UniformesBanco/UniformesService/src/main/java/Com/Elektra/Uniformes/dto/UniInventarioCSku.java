package Com.Elektra.Uniformes.Dto;

import java.util.List;


public class UniInventarioCSku {

    private Integer[] sku;
    private String ipTienda;

    public UniInventarioCSku(List<Integer> sku, String ipTienda) {
        super();
        this.sku = sku.toArray(new Integer[sku.size()]);
        this.ipTienda = ipTienda;
    }

    public Integer[] getSku() {
        return sku;
    }

    public void setSku(Integer[] sku) {
        this.sku = sku;
    }

    public String getIpTienda() {
        return ipTienda;
    }

    public void setIpTienda(String ipTienda) {
        this.ipTienda = ipTienda;
    }


}
