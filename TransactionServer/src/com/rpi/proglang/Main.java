package com.rpi.proglang;

import com.rpi.proglang.server.Server;

import java.io.IOException;

public class Main {

    public static void main(String[] args)
        throws IOException {
            // Gotta catch em all

        System.out.println(args[0]);

        Server.main(args);
	// write your code here
    }
}
