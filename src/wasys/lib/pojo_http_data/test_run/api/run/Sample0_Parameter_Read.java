/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample0_Parameter_Read.java
Created on: May 17, 2020 7:28:01 AM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Removed the last edit part from the file header (hard to track)

    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.run;

import java.util.Vector;
import wasys.lib.pojo_http_data.test_run.api.entity.Sample0_Entity;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Param_Entry;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Sample_Request_Data_Handler_Adapter;

/**
 *
 * @author https://github.com/911992
 */
public class Sample0_Parameter_Read {

    public static void main(String[] args) {
        Vector<Param_Entry> _params = new Vector<>();
        _params.add(new Param_Entry("email", "not_a_valid_email@really.iswear"));
        _params.add(new Param_Entry("password", "p911-forever"));
        _params.add(new Param_Entry("age", "71"));
        Sample_Request_Data_Handler_Adapter _data_handler = new Sample_Request_Data_Handler_Adapter(null, _params);
        Sample0_Entity _myres = new Sample0_Entity();
        _data_handler.fill_object(_myres);
        System.out.printf("Fill was success:%s(obj_fill_res: %s)\n", Boolean.toString(_myres.was_object_filling_success()), _myres.get_object_field_result());
        System.out.printf("email:%s , pass:%s , age:%d \n", _myres.getEmail(), _myres.getPassword(), _myres.getAge());
    }
}
