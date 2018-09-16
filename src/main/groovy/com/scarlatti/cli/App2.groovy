package com.scarlatti.cli

import picocli.CommandLine

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/15/2018
 */
class App2 {

    public static void main(String[] args) {

        println "main called with " + Arrays.asList(args)

        new CommandLine(new MainCommand())
            .parseWithHandler(new CommandLine.RunLast(), args)

        println "done"
    }
}
