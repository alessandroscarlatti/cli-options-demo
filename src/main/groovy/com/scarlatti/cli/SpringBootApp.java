package com.scarlatti.cli;

import picocli.CommandLine;

import java.util.Arrays;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/15/2018
 */
@CommandLine.Command(
    name = "app",
    description = "Run the Spring Boot App."
)
public class SpringBootApp implements Runnable {

    @CommandLine.Parameters(
        arity = "0..*",
        paramLabel = "args",
        description = "args to pass to the Spring Boot App."
    )
    private String[] args;

    @Override
    public void run() {
        System.out.println("Would run spring boot app with args: " + Arrays.asList(args));
    }
}
