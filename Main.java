package com.di.computer;

public class Main {

    public static void main(String[] args) {

        Computer computer = ComputerFactory.newInstance();

        computer.getRam();
        computer.getHardDisk();

    }

}
