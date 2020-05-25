/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample5_Entity_Inner.java
Created on: May 18, 2020 4:10:03 PM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Removed the last edit part from the file header (hard to track)

    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.entity;

import wasys.lib.pojo_http_data.api.Fillable_Object_Adapter;

/**
 *
 * @author https://github.com/911992
 */
public class Sample5_Entity_Inner extends Fillable_Object_Adapter {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
