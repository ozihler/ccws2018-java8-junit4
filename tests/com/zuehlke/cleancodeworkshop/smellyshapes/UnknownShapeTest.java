package com.zuehlke.cleancodeworkshop.smellyshapes;

import com.zuehlke.cleancodeworkshop.smellyshapes.testclasses.UnknownShape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("An unknown shape")
public class UnknownShapeTest {

    private UnknownShape unknownShape;

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
