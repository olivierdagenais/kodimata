// Copyright (c) Olivier Dagenais. All rights reserved.
// Licensed under the MIT license. See LICENSE in the project root.

package ca.bravodelta.kodimata

public class Controller {
    private final Map<Integer, Closure> pinsToActions = new LinkedHashMap<>();

    public void configureButton(final int pinId, final Closure action) {
        pinsToActions.put(pinId, action);
    }

    public void buttonPressed(final int pinId) {
        final action = pinsToActions.get(pinId)
        action();
    }
}
