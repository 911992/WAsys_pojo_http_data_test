/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample6_Entity.java
Created on: May 18, 2020 6:40:27 PM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Removed the last edit part from the file header (hard to track)

    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.entity;

import wasys.lib.pojo_http_data.api.Field_Fill_Result;
import wasys.lib.pojo_http_data.api.Fillable_Object_Adapter;
import wasys.lib.pojo_http_data.api.annotations.Field_Definition;

/**
 *
 * @author https://github.com/911992
 */
public class Sample6_Entity extends Fillable_Object_Adapter {

    @Field_Definition(param_name = "val", max_len_val = 1.0f, min_len_val = 0.0f)
    private float val;

    @Field_Definition(param_name = "val1", max_len_val = 1024.0f, min_len_val = 8.0f)
    private float val1;

    public float getVal() {
        return val;
    }

    public void setVal(float val) {
        this.val = val;
    }

    public float getVal1() {
        return val1;
    }

    public void setVal1(float val1) {
        this.val1 = val1;
    }

    @Override
    protected void set_field_fill_result_child(String arg_param_name, int arg_idx, Field_Fill_Result arg_result) {
        System.out.printf("Set field fill result, param: %s[%d] , result:%s\n", arg_param_name, arg_idx, arg_result);
    }

}
