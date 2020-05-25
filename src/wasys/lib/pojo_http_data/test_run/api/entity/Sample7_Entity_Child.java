/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

/*
WAsys_pojo_http_data_test
File: Sample7_Entity_Child.java
Created on: May 26, 2020 12:14:53 AM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Init version(for this file)
*/

package wasys.lib.pojo_http_data.test_run.api.entity;

import wasys.lib.pojo_http_data.api.annotations.No_Param;


/**
 * 
 * @author https://github.com/911992
 */
public class Sample7_Entity_Child extends Sample7_Entity{
    @No_Param
    private static Object cache_object_child=null;
    
    private String sub_model;

    public String getSub_model() {
        return sub_model;
    }

    public void setSub_model(String sub_model) {
        this.sub_model = sub_model;
    }
    
    @Override
    public void _api_ex_set_type_parse_result(Object arg_arg) {
        System.out.printf("Setting the global cache for %s as %s\n",this.getClass().getName(),arg_arg);
        Sample7_Entity_Child.cache_object_child = arg_arg;
    }

    @Override
    public Object _api_ex_get_type_parse_result() {
        System.out.printf("Returning the global cache for %s as %s\n",this.getClass().getName(),cache_object_child);
        return Sample7_Entity_Child.cache_object_child;
    }

    @Override
    protected void child_reset_state() {
        super.child_reset_state(); //To change body of generated methods, choose Tools | Templates.
        sub_model=null;
    }
    
    
}
