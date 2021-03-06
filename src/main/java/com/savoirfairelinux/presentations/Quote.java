package com.savoirfairelinux.presentations;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.TextField;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Button;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.FormLayout;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Quote extends TabSheet {
    protected FormLayout personalForm;
    protected TextField firstName;
    protected OptionGroup gender;
    protected Button next;
    protected FormLayout vehicleForm;
    protected ComboBox vehicleType;
    protected PopupDateField year;
    protected Button submit;

    public Quote() {
        Design.read(this);
    }
}
