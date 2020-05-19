/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample2_Entity.java
Created on: May 17, 2020 11:49:43 PM | last edit: May 17, 2020
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
public class Sample2_Entity extends Fillable_Object_Adapter {

    @Field_Definition(param_name = "1age", nullable = true)
    private float age = -1;

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

}
