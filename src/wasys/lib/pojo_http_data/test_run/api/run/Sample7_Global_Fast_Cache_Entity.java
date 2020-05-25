/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

/*
WAsys_pojo_http_data_test
File: Sample7_Global_Fast_Cache_Entity.java
Created on: May 26, 2020 12:24:29 AM
    @author https://github.com/911992
 
History:
    0.1.6(20200526)
        • Initial version for this file
*/

package wasys.lib.pojo_http_data.test_run.api.run;

import java.util.Vector;
import wasys.lib.pojo_http_data.test_run.api.entity.Sample7_Entity;
import wasys.lib.pojo_http_data.test_run.api.entity.Sample7_Entity_Child;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Param_Entry;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Sample_Request_Data_Handler_Adapter;


/**
 * 
 * @author https://github.com/911992
 */
public class Sample7_Global_Fast_Cache_Entity {
    public static void main(String[] args) {
        Vector<Param_Entry> _params = new Vector<>();
        _params.add(new Param_Entry("model", "911"));
        _params.add(new Param_Entry("sub_model", "992"));
        Sample_Request_Data_Handler_Adapter _data_handler = new Sample_Request_Data_Handler_Adapter(null, _params);
        Sample7_Entity_Child _myres_child = new Sample7_Entity_Child();
        Sample7_Entity _myres = new Sample7_Entity();
        System.out.println("First fill runn\n--------------");
        _data_handler.fill_object(_myres_child);
        System.out.printf("Model:%s , Submodel: %s\n",_myres_child.getModel(),_myres_child.getSub_model());
        _data_handler.fill_object(_myres);
        System.out.printf("Model:%s\n",_myres.getModel());
        _params.clear();
        _myres_child.reset_fill_state();
        _myres.reset_fill_state();
        _params.add(new Param_Entry("model", "718"));
        _params.add(new Param_Entry("sub_model", "Spyder"));
        System.out.println("Second fill runn\n--------------");
        _data_handler.fill_object(_myres_child);
        System.out.printf("Model:%s , Submodel: %s\n",_myres_child.getModel(),_myres_child.getSub_model());
        _data_handler.fill_object(_myres);
        System.out.printf("Model:%s\n",_myres.getModel());
        
    }
}
