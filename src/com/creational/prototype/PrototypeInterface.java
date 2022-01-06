package com.creational.prototype;

public interface PrototypeInterface extends Cloneable{

    PrototypeInterface clone() throws CloneNotSupportedException;
}
