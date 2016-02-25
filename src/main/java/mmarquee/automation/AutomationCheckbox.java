/*
 * Copyright 2016 inpwtepydjuf@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mmarquee.automation;

import mmarquee.automation.pattern.TogglePattern;
import mmarquee.automation.uiautomation.*;

/**
 * Created by inpwt on 31/01/2016.
 */
public class AutomationCheckbox extends AutomationBase {

    private TogglePattern togglePattern;

    /**
     * <p>
     * Invokes the toggle event for this control
     * </p>
     */
    public void toggle () {
        this.togglePattern.toggle();
    }

    /**
     * <p>
     * Gets the toggle state of this control
     * </p>
     */
    public ToggleState getToggleState () {
        return this.togglePattern.currentToggleState();
    }

    public AutomationCheckbox (IUIAutomationElement element, IUIAutomation uiAuto) {
        super(element, uiAuto);

        togglePattern = this.getTogglePattern();
    }
}
