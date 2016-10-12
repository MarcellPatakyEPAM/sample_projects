package com.epam.gauge.demo.core.customelement.elements;

import com.epam.gauge.demo.core.customelement.base.Element;

/**
 * Created on 2016-10-11.
 * @author Marcell_Pataky
 */
public interface CheckBox extends Element {

    void toggle();
    void check();
    void unCheck();
    boolean isChecked();

}
