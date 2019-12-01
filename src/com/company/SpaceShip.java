package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item item);
    int carry(Item item);

}