package net.tcpudp_2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        // 1. 连接服务器
        Socket socket = new Socket("127.0.0.1", 8989);

        // 2. 接收服务器转发的消息
        Receive receive = new Receive(socket);
        receive.run();

        // 3. 发送自己的话
        Send send = new Send(socket);
        send.run();


        socket.close();


    }
}
