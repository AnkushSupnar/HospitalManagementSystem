package com.ankush.HospitalManagement.view;

import java.util.ResourceBundle;

public enum FxmlView {

    LOGIN {
        @Override
        public String getTitle() {
           return "Add Item";
        }
        @Override
        public String getFxmlFile() {
            return "/fxml/home/Login.fxml";
        }
    
    
    };
    public abstract String getTitle();
    public abstract String getFxmlFile();
    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }
}
