/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample1_Entity.java
Created on: May 17, 2020 11:04:35 PM | last edit: May 17, 2020
    @author https://github.com/911992
 
History:
    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.entity;

import wasys.lib.pojo_http_data.api.Fillable_Object_Adapter;
import wasys.lib.pojo_http_data.api.annotations.Field_Definition;

/**
 *
 * @author https://github.com/911992
 */
public class Sample1_Entity extends Fillable_Object_Adapter {

    @Field_Definition(param_name = "model", param_idx = 0)
    private String model_0;
    @Field_Definition(param_name = "model", param_idx = 1)
    private String model_1;
    @Field_Definition(param_name = "model", param_idx = 2)
    private String model_2;

    public String getModel_0() {
        return model_0;
    }

    public void setModel_0(String model_0) {
        this.model_0 = model_0;
    }

    public String getModel_1() {
        return model_1;
    }

    public void setModel_1(String model_1) {
        this.model_1 = model_1;
    }

    public String getModel_2() {
        return model_2;
    }

    public void setModel_2(String model_2) {
        this.model_2 = model_2;
    }

}
