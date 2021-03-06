/**
 * This file is part of Support Bot.
 *
 *     Foobar is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Foobar is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * This is the source code of Telegram Bot v. 2.0
 * It is licensed under GNU GPL v. 3 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Ruben Bermudez, 21/11/14.
 */
package org.telegram.api.privacy.privacyrule;

import org.telegram.tl.TLObject;

/**
 * The type TL abs privacy rule.
 * @author Ruben Bermudez
 * @version 2.0
 * @brief TLAbsPrivacyRule
 * @date 21 /11/14
 */
public abstract class TLAbsPrivacyRule extends TLObject {
    /**
     * Instantiates a new TL abs privacy rule.
     */
    protected TLAbsPrivacyRule() {
        super();
    }
}
