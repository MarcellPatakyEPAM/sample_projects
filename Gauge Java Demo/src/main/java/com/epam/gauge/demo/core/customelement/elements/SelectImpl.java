package com.epam.gauge.demo.core.customelement.elements;

import com.epam.gauge.demo.core.customelement.base.ElementImpl;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectImpl extends ElementImpl implements Select {

    private final org.openqa.selenium.support.ui.Select innerSelect;

    public SelectImpl(WebElement element) {
        super(element);
        innerSelect = new  org.openqa.selenium.support.ui.Select(element);;
    }

    @Override
    public boolean isMultiple() {
        return innerSelect.isMultiple();
    }

    @Override
    public void deselectByIndex(int index) {
        innerSelect.deselectByIndex(index);
    }

    @Override
    public void selectByValue(String value) {

    }

    @Override
    public WebElement getFirstSelectedOption() {
        return null;
    }

    @Override
    public void selectByVisibleText(String text) {

    }

    @Override
    public void deselectByValue(String value) {

    }

    @Override
    public void deselectAll() {

    }

    @Override
    public List<WebElement> getAllSelectedOptions() {
        return null;
    }

    @Override
    public List<WebElement> getOptions() {
        return null;
    }

    @Override
    public void deselectByVisibleText(String text) {

    }

    @Override
    public void selectByIndex(int index) {

    }
}
