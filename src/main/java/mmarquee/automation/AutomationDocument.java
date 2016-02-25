package mmarquee.automation;

import mmarquee.automation.pattern.TextPattern;
import mmarquee.automation.pattern.ValuePattern;
import mmarquee.automation.uiautomation.IUIAutomation;
import mmarquee.automation.uiautomation.IUIAutomationElement;
import mmarquee.automation.uiautomation.IUIAutomationTextPattern;
import mmarquee.automation.uiautomation.IUIAutomationValuePattern;

/**
 * Created by inpwt on 16/02/2016.
 */
public class AutomationDocument extends AutomationBase {
    private TextPattern textPattern;
    private ValuePattern valuePattern;

    public AutomationDocument(IUIAutomationElement element, IUIAutomation uiAuto) {
        super(element, uiAuto);

        this.textPattern = this.getTextPattern();
        this.valuePattern = this.getValuePattern();
    }
}
