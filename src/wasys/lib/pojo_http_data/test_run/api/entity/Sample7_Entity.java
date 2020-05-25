/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

/*
WAsys_pojo_http_data_test
File: Sample7_Entity.java
Created on: May 25, 2020 11:26:14 PM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Init version(for this file)
*/

package wasys.lib.pojo_http_data.test_run.api.entity;

import wasys.lib.pojo_http_data.api.Fillable_Object_Adapter;
import wasys.lib.pojo_http_data.api.annotations.No_Param;
import wasys.lib.pojo_http_data.api_ex.Fillable_Object_Parse_Cache_Accelerator;


/**
 * 
 * @author https://github.com/911992
 */
public class Sample7_Entity extends Fillable_Object_Adapter implements Fillable_Object_Parse_Cache_Accelerator{

    @No_Param
    private static Object cache_object=null;
    
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
   
    
    @Override
    public void _api_ex_set_type_parse_result(Object arg_arg) {
        System.out.printf("Setting the global cache for %s as %s\n",this.getClass().getName(),arg_arg);
        Sample7_Entity.cache_object = arg_arg;
    }

    @Override
    public Object _api_ex_get_type_parse_result() {
        System.out.printf("Returning the global cache for %s as %s\n",this.getClass().getName(),cache_object);
        return Sample7_Entity.cache_object;
    }

    @Override
    protected void child_reset_state() {
        super.child_reset_state();
        model = null;
    }
    
    

}
