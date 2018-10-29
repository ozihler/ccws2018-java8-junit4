package com.zuehlke.cleancodeworkshop.smellyshapes.testclasses;

import com.zuehlke.cleancodeworkshop.smellyshapes.AbstractShape;

public class UnknownShape extends AbstractShape {

    @Override
    public boolean contains(int x, int y) {
        return false;
    }
}