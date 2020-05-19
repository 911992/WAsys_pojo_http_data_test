/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample5_Entity.java
Created on: May 18, 2020 4:09:43 PM | last edit: May 18, 2020
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
public class Sample5_Entity extends Fillable_Object_Adapter {

    final private Sample5_Entity_Inner _inner_entity0 = new Sample5_Entity_Inner();
    final private Sample5_Entity_Inner _inner_entity1 = new Sample5_Entity_Inner();
    @Field_Definition(param_name = "model", param_idx = 0)
    private String model0;
    @Field_Definition(param_name = "model", param_idx = 1)
    private String model1;

    public Sample5_Entity_Inner getInner_entity0() {
        return _inner_entity0;
    }

    public Sample5_Entity_Inner getInner_entity1() {
        return _inner_entity1;
    }

    public String getModel0() {
        return model0;
    }

    public void setModel0(String model0) {
        this.model0 = model0;
    }

    public String getModel1() {
        return model1;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

}
