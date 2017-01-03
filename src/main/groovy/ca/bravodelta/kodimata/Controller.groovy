// Copyright (c) Olivier Dagenais. All rights reserved.
// Licensed under the MIT license. See LICENSE in the project root.

package ca.bravodelta.kodimata

public class Controller {
    private final Map<Integer, Closure> pinsToActions = new LinkedHashMap<>();

    // TODO: the "action" seems too broad and arbitrary:
    // can we restrict to interface members of MediaPlayer for the associated instance?
    public void configureButton(final int pinId, final Closure action) {
        pinsToActions.put(pinId, action);
    }

    public void buttonPressed(final int pinId) {
        final action = pinsToActions.get(pinId)
        action();
    }
}
