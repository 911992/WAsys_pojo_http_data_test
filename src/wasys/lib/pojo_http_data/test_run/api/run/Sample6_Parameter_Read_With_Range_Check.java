/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample6_Parameter_Read_With_Range_Check.java
Created on: May 18, 2020 6:42:11 PM
    @author https://github.com/911992
 
History:
    0.2.5 (20200813)
        • Added values for val2 new added field
        • Printing the generated messages after a linefeed(\n)

    0.1.6(20200525)
        • Removed the last edit part from the file header (hard to track)

    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.run;

import java.util.Vector;
import wasys.lib.pojo_http_data.test_run.api.entity.Sample6_Entity;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Param_Entry;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Sample_Request_Data_Handler_Adapter;

/**
 *
 * @author https://github.com/911992
 */
public class Sample6_Parameter_Read_With_Range_Check {

    public static void main(String[] args) {
        Vector<Param_Entry> _params = new Vector<>();
        _params.add(new Param_Entry("val", "911.991f"));
        _params.add(new Param_Entry("val1", "911.992f"));
        _params.add(new Param_Entry("val2", "4195"));
        Sample_Request_Data_Handler_Adapter _data_handler = new Sample_Request_Data_Handler_Adapter(null, _params);
        Sample6_Entity _myres = new Sample6_Entity();
        _data_handler.fill_object(_myres);
        System.out.printf("Fill was success:%s(obj_fill_res: %s)\n", Boolean.toString(_myres.was_object_filling_success()), _myres.get_object_field_result());
        System.out.printf("Fill note messages:\n%s\n", _myres.get_fields_fill_msg());
        System.out.printf("val:%f , val1:%f \n", _myres.getVal(), _myres.getVal1());
    }
}
