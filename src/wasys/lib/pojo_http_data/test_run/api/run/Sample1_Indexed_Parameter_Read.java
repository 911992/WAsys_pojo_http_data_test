/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample1_Indexed_Parameter_Read.java
Created on: May 17, 2020 11:08:09 PM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Removed the last edit part from the file header (hard to track)

    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.run;

import java.util.Vector;
import wasys.lib.pojo_http_data.test_run.api.entity.Sample1_Entity;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Param_Entry;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Sample_Request_Data_Handler_Adapter;

/**
 *
 * @author https://github.com/911992
 */
public class Sample1_Indexed_Parameter_Read {

    public static void main(String[] args) {
        Vector<Param_Entry> _params = new Vector<>();
        _params.add(new Param_Entry("model", "911992"));
        _params.add(new Param_Entry("model", "911991"));
        _params.add(new Param_Entry("model", "718"));
        Sample_Request_Data_Handler_Adapter _data_handler = new Sample_Request_Data_Handler_Adapter(null, _params);
        Sample1_Entity _myres = new Sample1_Entity();
        _data_handler.fill_object(_myres);
        System.out.printf("Fill was success:%s(obj_fill_res: %s)\n", Boolean.toString(_myres.was_object_filling_success()), _myres.get_object_field_result());
        System.out.printf("model0:%s , model1:%s , model2:%s \n", _myres.getModel_0(), _myres.getModel_1(), _myres.getModel_2());
    }
}
