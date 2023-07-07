package com.di.computer;


class RamFactory {

    static Ram newInstance() {
        return new Ram();
    }

}

class HardDiskFactory {

    static HardDisk newInstance() {
        return new HardDisk();
    }

}

class ComputerFactory {

    static Computer newInstance() {
        return new Computer(RamFactory.newInstance(), HardDiskFactory.newInstance());
    }

}
