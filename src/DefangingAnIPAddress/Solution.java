package DefangingAnIPAddress;

class Solution {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}