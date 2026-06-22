public class LCDefangingIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}