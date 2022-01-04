package defensive_copy.v2;

import defensive_copy.Code;

public final class Order {

    private final Code code;

    public Order(Code code){
        this.code = new Code(code.getCode());
    }

    public Code getCode() {
        return new Code(code.getCode());
    }
}
