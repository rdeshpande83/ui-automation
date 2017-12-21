/*
 * Copyright 2016-17 inpwtepydjuf@gmail.com
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
package mmarquee.automation.uiautomation;

import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

/**
 * @author Mark Humphreys
 * Date 10/12/2017
 */
public interface IUIAutomationSelectionPattern2
        extends IUIAutomationSelectionPattern {
    /**
     * The interface IID for QueryInterface et al
     */
    Guid.IID IID = new Guid.IID(
                "{0532bfae-c011-4e32-a343-6d642d798555}");

    int getCurrentCurrentSelectedItem(PointerByReference retval);
    int getCurrentFirstSelectedItem(PointerByReference retval);
    int getCurrentItemCount(IntByReference retval);
    int getCurrentLastSelectedItem(PointerByReference retval);
}
