package net.tcpudp_2;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Receive {
    // 这是服务器端的处理，服务器端先运行起来，等待客户端来连接
    private Socket socket;

    public Receive(Socket socket) {
        this.socket = socket;
    }

    public void run() throws IOException {
        InputStream input = socket.getInputStream();

        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

}
