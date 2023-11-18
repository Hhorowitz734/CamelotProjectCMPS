package com.actions;

import com.entities.Character;
import com.entities.Place;

/**
 * Represents an action where a character enters a location, with an optional fade-in effect.
 * @see com.entities.Character
 * @see com.entities.Place
 */
public class Enter implements IAction {
    private Character character;
    private Place location;
    private boolean fadeIn; // Optional fade-in effect, default is false

    /**
     * Constructor for entering a location without a fade-in effect.
     * @param character The character who will perform the action.
     * @param location The location to be entered.
     */
    public Enter(Character character, Place location) {
        this(character, location, false); // Delegate to the main constructor with default fadeIn as false
    }

    /**
     * Constructor for entering a location with an optional fade-in effect.
     * @param character The character who will perform the action.
     * @param location The location to be entered.
     * @param fadeIn Whether to apply a fade-in effect or not.
     */
    public Enter(Character character, Place location, boolean fadeIn) {
        this.character = character;
        this.location = location;
        this.fadeIn = fadeIn;
    }

    /**
     * @return Enter
     */
    @Override
    public String getName() {
        return "Enter";
    }

    /**
     * This action might require the system to wait until the character completes entering the location.
     * @return true
     */
    @Override
    public boolean getShouldWait() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %s, %s)", getName(), character.getName(), location.getName(), fadeIn);
    }
}
