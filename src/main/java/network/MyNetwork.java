package network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyNetwork {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.google.com";

        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println(inetAddress.getHostAddress());
    }
}
