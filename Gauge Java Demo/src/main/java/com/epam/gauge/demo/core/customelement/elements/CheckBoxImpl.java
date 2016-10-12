package com.epam.gauge.demo.core.customelement.elements;

import com.epam.gauge.demo.core.customelement.base.ElementImpl;
import org.openqa.selenium.WebElement;

/**
 * Created on 2016-10-11.
 * @author Marcell_Pataky
 */
public class CheckBoxImpl extends ElementImpl implements CheckBox {


    public CheckBoxImpl(WebElement element) {
        super(element);
    }

    @Override
    public void toggle() {
        getWrappedElement().click();
    }

    @Override
    public void check() {
        if(!isChecked()) {
            toggle();
        }
    }

    @Override
    public void unCheck() {
        if(isChecked()) {
            toggle();
        }
    }

    @Override
    public boolean isChecked() {
        return getWrappedElement().isSelected();
    }
}
