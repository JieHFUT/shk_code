package net.tcpudp_2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Send {
    // 这是客户端的发送端
    private Socket socket;
    public Send(Socket socket) throws IOException {
        this.socket = socket;
    }

    public void run() throws IOException {
        Scanner input = new Scanner(System.in);
        OutputStream output = socket.getOutputStream();

        // 按行打印
        PrintStream printStream = new PrintStream(output);

        while(true){
            System.out.print("自己的话：");
            String str = input.nextLine(); //阻塞式的方法
            if("bye".equals(str)){
                break;
            }
            printStream.println(str);
        }

        input.close();
    }


}
