package com.vimeo.sample;

import com.vimeo.sample.model.NoUseStagAnnotation;

import org.junit.Test;

/**
 * Created by restainoa on 1/30/17.
 */
public class NoUseStagAnnotationTest {

    @Test
    public void typeAdapterWasGenerated() throws Exception {
        Utils.verifyTypeAdapterGeneration(NoUseStagAnnotation.class);
    }

}
