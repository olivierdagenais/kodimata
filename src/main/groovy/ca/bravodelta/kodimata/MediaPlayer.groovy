// Copyright (c) Olivier Dagenais. All rights reserved.
// Licensed under the MIT license. See LICENSE in the project root.

package ca.bravodelta.kodimata

public interface MediaPlayer {
    boolean isPlaying();

    // actions
    void playPause();
    void stop();
    void playNext();
    void playPrevious();
}
