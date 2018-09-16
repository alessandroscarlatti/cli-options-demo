package com.scarlatti.cli;

import org.apache.commons.cli.*;

import java.util.Arrays;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/15/2018
 */
public class App implements Runnable {

    private String[] args;

    public App(String[] args) {
        System.out.println("You sent " + Arrays.asList(args));
        this.args = args;
    }

    public static void main(String[] args) {
        new App(args).run();
    }

    @Override
    public void run() {
        try {
            Options options = new Options();
            options.addOption("help", "help", false, "display this message");

            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(options, args);

            // a help message is not exactly necessary for development...
            if (cmd.getArgList().size() == 0 ||
                cmd.hasOption("help")) {
                HelpFormatter helpFormatter = new HelpFormatter();
                helpFormatter.printHelp("app", options);
            }
            if (cmd.getArgList().size() > 0) {
                if (cmd.getArgList().get(0).equals("echo")) {
//                    new EchoCommand(Arrays.asList(args).subList(1, args.length).toArray(new String[]{})).run();
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
