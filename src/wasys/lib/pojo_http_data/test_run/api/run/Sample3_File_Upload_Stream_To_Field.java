/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_pojo_http_data_test
File: Sample3_File_Upload_Stream_To_Field.java
Created on: May 18, 2020 4:00:37 AM | last edit: May 18, 2020
    @author https://github.com/911992
 
History:
    initial version: 0.1(20200513)
 */
package wasys.lib.pojo_http_data.test_run.api.run;

import java.util.Vector;
import wasys.lib.pojo_http_data.test_run.api.entity.Sample3_Entity;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Local_Stream_Entry;
import wasys.lib.pojo_http_data.test_run.api_wrapper.Sample_Request_Data_Handler_Adapter;

/**
 *
 * @author https://github.com/911992
 */
public class Sample3_File_Upload_Stream_To_Field {

    public static void main(String[] args) {
        Vector<Local_Stream_Entry> _files = new Vector<Local_Stream_Entry>(1);
        _files.add(new Local_Stream_Entry(Sample3_Entity.PARAM_UPLOAD, "porsche-wikipedia.svg", "image/svg+xml"));
        Sample_Request_Data_Handler_Adapter _data_handler = new Sample_Request_Data_Handler_Adapter(_files, null);
        Sample3_Entity _myres = new Sample3_Entity();
        _data_handler.fill_object(_myres);
        System.out.printf("Fill was success:%s(obj_fill_res: %s)\n", Boolean.toString(_myres.was_object_filling_success()), _myres.get_object_field_result());
    }
}
