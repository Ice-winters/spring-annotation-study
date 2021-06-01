package com.ice.beans;

/**
 * @author : Ice-winters
 * @since : 2021-06-01 14:01
 */
public class CarImportSelector extends ComponentImportSelector{


    @Override
    protected String[] selectImports(String... basePackages) {
        return new String[] {basePackages[0]};
    }
}
