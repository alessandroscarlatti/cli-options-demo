package com.scarlatti.cli;

import picocli.CommandLine;
import picocli.CommandLine.Parameters;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/15/2018
 */
@CommandLine.Command(
    name = "echo"
)
public class EchoCommand implements Runnable {

    @Parameters(
        index = "0",
        paramLabel = "text",
        description = "text to echo"
    )
    private String text;

    @Override
    public void run() {
        System.out.println("echo: " + text);
    }
}
