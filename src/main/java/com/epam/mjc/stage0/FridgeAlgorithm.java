package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm {
    public void fridgeAlgorithm(Fridge fridge) {


        Fridge myFridge = new Fridge() {
            @Override
            public void close() {

            }

            @Override
            public void open() {

            }

            @Override
            public void getMilk() {

            }
        };

        myFridge.open();
        myFridge.getMilk();
        myFridge.close();


    }
}
