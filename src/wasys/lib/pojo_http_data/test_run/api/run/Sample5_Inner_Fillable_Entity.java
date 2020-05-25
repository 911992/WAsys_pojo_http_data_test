/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample5_Inner_Fillable_Entity.java
Created on: May 18, 2020 5:24:31 PM
    @author https://github.com/911992
 
History:
    0.1.6(20200525)
        • Removed the last edit part from the file header (hard to track)

    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.run;

import java.util.Vector;
import wasys.lib.pojo_http_data.test_run.api.entity.Sample5_Entity;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Param_Entry;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Sample_Request_Data_Handler_Adapter;

/**
 *
 * @author https://github.com/911992
 */
public class Sample5_Inner_Fillable_Entity {

    public static void main(String[] args) {
        Vector<Param_Entry> _params = new Vector<>();
        _params.add(new Param_Entry("brand", "Porsche"));
        _params.add(new Param_Entry("model", "911991.2"));
        _params.add(new Param_Entry("model", "911992"));
        Sample_Request_Data_Handler_Adapter _data_handler = new Sample_Request_Data_Handler_Adapter(null, _params);
        Sample5_Entity _myres = new Sample5_Entity();
        _data_handler.fill_object(_myres);
        System.out.printf("Parent obj fill was success:%s(obj_fill_res: %s)\n", Boolean.toString(_myres.was_object_filling_success()), _myres.get_object_field_result());
        System.out.printf("Child[0] obj fill was success:%s(obj_fill_res: %s)\n", Boolean.toString(_myres.getInner_entity0().was_object_filling_success()), _myres.getInner_entity0().get_object_field_result());
        System.out.printf("Child[1] obj fill was success:%s(obj_fill_res: %s)\n", Boolean.toString(_myres.getInner_entity1().was_object_filling_success()), _myres.getInner_entity1().get_object_field_result());
        System.out.printf("Parent model0:%s , model1:%s \n", _myres.getModel0(), _myres.getModel1());
        System.out.printf("Child[0] brand:%s \n", _myres.getInner_entity0().getBrand());
        System.out.printf("Child[1] brand:%s \n", _myres.getInner_entity1().getBrand());
    }
}
