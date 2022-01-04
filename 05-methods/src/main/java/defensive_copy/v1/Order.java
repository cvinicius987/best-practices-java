package defensive_copy.v1;

import defensive_copy.Code;

public final class Order {

    private final Code code;

    public Order(Code code){
        this.code = code;
    }

    public Code getCode() {
        return code;
    }
}
