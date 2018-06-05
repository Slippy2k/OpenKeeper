/*
 * Copyright (C) 2014-2018 OpenKeeper
 *
 * OpenKeeper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenKeeper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenKeeper.  If not, see <http://www.gnu.org/licenses/>.
 */
package toniarts.openkeeper.game.state.session;

import com.jme3.math.Vector3f;

/**
 * Handles player related requests
 *
 * @author Toni Helenius <helenius.toni@gmail.com>
 */
public interface PlayerService {

    /**
     * Set widescreen mode to the player
     *
     * @param enable   set widescreen on/off
     * @param playerId the player to set to
     */
    public void setWidescreen(boolean enable, short playerId);

    /**
     * Play a speech on the player
     *
     * @param speechId     the speech ID
     * @param showText     show subtitles
     * @param introduction whether this is an introduction or not
     * @param pathId       camera path
     * @param playerId     the player to hear the speech
     */
    public void playSpeech(int speechId, boolean showText, boolean introduction, int pathId, short playerId);

    /**
     * Is any of the players in UI transition (cinematic playing)
     *
     * @return true if in transition
     */
    public boolean isInTransition();

    /**
     * Do an UI transition, a cinematic
     *
     * @param pathId   the camera path to use
     * @param start    starting coordinates
     * @param playerId the player ID who should play the transition
     */
    public void doTransition(short pathId, Vector3f start, short playerId);

}
