package Com.Elektra.Uniformes.Services.resp;

public class ValueResponse<T> extends ServiceResponse {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
