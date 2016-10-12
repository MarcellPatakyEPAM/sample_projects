package com.epam.gauge.demo.core.customelement.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;


public interface Element extends WebElement, WrapsElement, Locatable {

    boolean elementWired();

}
