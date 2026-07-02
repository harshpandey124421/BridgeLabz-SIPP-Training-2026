interface CouponValidator {
    void validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {
    @Override
    public void validateCoupon(String code) {
        if (CouponValidator.isLengthValid(code)) {
            System.out.println("Coupon " + code + " is VALID.");
        } else {
            System.out.println("Coupon " + code + " is INVALID.");
        }
    }
}

public class OnlineCouponValidator {
    public static void main(String[] args) {
        String[] coupons = {"DISCOUNT10", "OFF", "SAVE2024", "SUPERLONGCOUPON"};
        ShoppingCart cart = new ShoppingCart();
        
        for (String coupon : coupons) {
            cart.validateCoupon(coupon);
        }
    }
}