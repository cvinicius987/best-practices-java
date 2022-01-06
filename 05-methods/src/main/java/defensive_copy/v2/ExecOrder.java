package defensive_copy.v2;

import defensive_copy.Code;

public class ExecOrder {

    public static void main(String[] args) {

        Code code = new Code("9874561230");
        System.out.println(code.getCode());

        Order order = new Order(code);

        //Change the Code instance
        code.setCode("2022456789");

        System.out.println(order.getCode());
    }
}
