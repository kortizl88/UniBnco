package Com.Elektra.Uniformes.Dto;

import java.util.List;

public class ResultWrapper<T> {

    private T returnVal;

    private List<T> list;

    public T getReturnVal() {
        return returnVal;
    }

    public void setReturnVal(T returnVal) {
        this.returnVal = returnVal;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
