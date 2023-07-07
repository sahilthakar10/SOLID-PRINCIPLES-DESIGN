package com.di.computer;

class Computer {

    private Ram ram;
    private HardDisk hardDisk;

    Computer(Ram ram, HardDisk hardDisk){
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    void getRam() {
        ram.getRam();
    }

    void getHardDisk() {
        hardDisk.getHardDisk();
    }

}
