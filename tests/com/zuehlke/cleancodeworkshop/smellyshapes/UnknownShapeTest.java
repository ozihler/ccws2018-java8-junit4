package com.zuehlke.cleancodeworkshop.smellyshapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("An unknown shape")
public class UnknownShapeTest {

    private UnknownShape unknownShape;

    class UnknownShape extends AbstractShape{

        @Override
        public boolean contains(int x, int y) {
            return false;
        }
    }

    @BeforeEach
    public void init(){
        unknownShape = new UnknownShape();
    }

    @Test
    @DisplayName("should throw an exception when initialised")
    public void throwsExceptionWhenInitialised(){
        assertThrows(RuntimeException.class, () -> unknownShape.toXml());
    }
}
