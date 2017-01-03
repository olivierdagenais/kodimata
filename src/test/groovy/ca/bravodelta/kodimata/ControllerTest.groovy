// Copyright (c) Olivier Dagenais. All rights reserved.
// Licensed under the MIT license. See LICENSE in the project root.

package ca.bravodelta.kodimata

import groovy.transform.CompileStatic
import org.junit.Test
import org.mockito.Mockito

/**
 * A class to test {@link Controller}.
 */
@CompileStatic
public class ControllerTest {

    @Test public void buttonPressed_validAction() {
        final controller = new Controller();
        final mediaPlayer = Mockito.mock(MediaPlayer.class);
        controller.configureButton(4, mediaPlayer.&playPause);

        controller.buttonPressed(4);

        Mockito.verify(mediaPlayer).playPause();
    }

}
